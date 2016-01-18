package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class QueryActivity extends Activity {

    EditText ed;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        ed = (EditText) findViewById(R.id.QueryTextView);
        b = (Button) findViewById(R.id.QueryButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"grobots.srmgpc@gmail.com"}); //input
                //emailInentputExtra(Intent.EXTRa_CC,new String[]{""xyz@gmail.com"});
                //sends to another person at the same time
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "QUERY via App");
                emailIntent.putExtra(Intent.EXTRA_TEXT, ed.getText().toString());
                emailIntent.setType("message/rfc822"); //email client
                startActivity(Intent.createChooser(emailIntent, "Choose email client"));

            }
        });
    }
}
