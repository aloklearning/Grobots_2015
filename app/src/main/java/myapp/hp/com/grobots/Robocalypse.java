package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Robocalypse extends Activity {

    Button r1,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robocalypse);
        r1 = (Button) findViewById(R.id.RButton1);
        r3 = (Button) findViewById(R.id.RButton3);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Robocalypse.this,WarAbout.class);
                startActivity(intent);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Robocalypse.this, WarContact.class);
                startActivity(intent);
            }
        });
    }
}
