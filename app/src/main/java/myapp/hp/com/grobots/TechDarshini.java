package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class TechDarshini extends Activity {

    Button t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_darshini);
        t1 = (Button) findViewById(R.id.TButton1);
        t2 = (Button) findViewById(R.id.TButton2);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TechDarshini.this, TechAbout.class);
                startActivity(intent);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TechDarshini.this, TechContact.class);
                startActivity(intent);
            }
        });
    }
}
