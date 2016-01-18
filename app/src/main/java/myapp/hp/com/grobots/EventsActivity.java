package myapp.hp.com.grobots;

import android.app.Activity;
import android.app.usage.UsageEvents;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class EventsActivity extends Activity {

    Button c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        c1 = (Button) findViewById(R.id.EventButton1);
        c2 = (Button) findViewById(R.id.EventButton2);
        c3 = (Button) findViewById(R.id.EventButton3);
        c4 = (Button) findViewById(R.id.EventButton4);
        c5 = (Button) findViewById(R.id.EventButton5);
        c6 = (Button) findViewById(R.id.EventButton6);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventsActivity.this,Skynomous.class);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventsActivity.this,Aquagrine.class);
                startActivity(intent);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventsActivity.this,Sprint.class);
                startActivity(intent);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventsActivity.this,Robocalypse.class);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventsActivity.this,Uvaan.class);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EventsActivity.this,TechDarshini.class);
                startActivity(intent);
            }
        });
    }
}
