package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ScheduleActivity extends Activity {

    Button d1,d2,d3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        d1 = (Button) findViewById(R.id.day1);
        d2 = (Button) findViewById(R.id.day2);
        d3 = (Button) findViewById(R.id.day3);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScheduleActivity.this,Day1.class);
                startActivity(intent);
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScheduleActivity.this,Day2.class);
                startActivity(intent);
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScheduleActivity.this,Day3.class);
                startActivity(intent);
            }
        });

    }
}
