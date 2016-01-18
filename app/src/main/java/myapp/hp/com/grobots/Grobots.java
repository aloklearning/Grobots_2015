package myapp.hp.com.grobots;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;


public class Grobots extends Activity {

    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grobots);
        b1 = (Button) findViewById(R.id.info);
        b2 = (Button) findViewById(R.id.events);
        b3 = (Button) findViewById(R.id.register);
        b4 = (Button) findViewById(R.id.schedule);
        b5 = (Button) findViewById(R.id.results);
        b6 = (Button) findViewById(R.id.notification);
        b7 = (Button) findViewById(R.id.quer);
        b8 = (Button) findViewById(R.id.exit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grobots.this,About.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grobots.this,EventsActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grobots.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grobots.this,ScheduleActivity.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grobots.this,Results.class);
                startActivity(intent);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grobots.this,Notifications.class);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grobots.this,QueryActivity.class);
                startActivity(intent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Grobots.this);
                builder.setMessage("Are you sure you want to exit?");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Grobots.this.finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }

}