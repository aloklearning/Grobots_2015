package myapp.hp.com.grobots;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class About extends Activity {

    TextView tv;
    Button a1,a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        tv = (TextView) findViewById(R.id.aboutg);
        a1 = (Button) findViewById(R.id.aboutevent);
        a2 = (Button) findViewById(R.id.committe);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(About.this,AboutActivity.class);
                startActivity(intent);
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(About.this,CommitteeActivity.class);
                startActivity(intent);
            }
        });
    }
}
