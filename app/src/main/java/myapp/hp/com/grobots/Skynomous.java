package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Skynomous extends Activity {

    Button s1,s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skynomous);
        s1 = (Button) findViewById(R.id.SButton1);
        s3 = (Button) findViewById(R.id.SButton3);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Skynomous.this, SkyAbout.class);
                startActivity(intent);
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Skynomous.this, SkyContact.class);
                startActivity(intent);
            }
        });
    }
}
