package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Sprint extends Activity {

    Button d1,d3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sprint);
        d1 = (Button) findViewById(R.id.DButton1);
        d3 = (Button) findViewById(R.id.DButton3);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sprint.this,SprintAbout.class);
                startActivity(intent);
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sprint.this, SprintContact.class);
                startActivity(intent);
            }
        });
    }
}
