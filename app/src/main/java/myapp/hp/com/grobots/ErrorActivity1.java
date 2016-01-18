package myapp.hp.com.grobots;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ErrorActivity1 extends Activity {

    Button e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error_activity1);
        e1 = (Button) findViewById(R.id.ErrorButton1);

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ErrorActivity1.this,Notifications.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
