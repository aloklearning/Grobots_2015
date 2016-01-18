package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Uvaan extends Activity {

    Button u1,u3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uvaan);
        u1 = (Button) findViewById(R.id.UButton1);
        u3 = (Button) findViewById(R.id.UButton3);
        u1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Uvaan.this, UvaanAbout.class);
                startActivity(intent);
            }
        });
        u3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Uvaan.this, UvaanContact.class);
                startActivity(intent);
            }
        });
    }
}
