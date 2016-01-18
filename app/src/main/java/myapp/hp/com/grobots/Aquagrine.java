package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Aquagrine extends Activity {

    Button a1,a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquagrine);
        a1 = (Button) findViewById(R.id.AButton1);
        a3 = (Button) findViewById(R.id.AButton3);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aquagrine.this,AquaAbout.class);
                startActivity(intent);
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aquagrine.this,AquaContact.class);
                startActivity(intent);
            }
        });
    }
}
