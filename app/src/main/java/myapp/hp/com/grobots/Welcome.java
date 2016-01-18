package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;


public class Welcome extends Activity {

    TextView tv;
    ProgressBar pb;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tv = (TextView) findViewById(R.id.WelcomeText);
        pb = (ProgressBar) findViewById(R.id.WelcomeProgressBar);
        tv.postDelayed(new Runnable() {

            @Override
            public void run() {
                intent =  new Intent(Welcome.this,Grobots.class);
                startActivity(intent);
            }
        }, 3000);
        Thread t = new Thread(){
            public void run(){
                for(int i=0;i<100;i+=5){
                    pb.setProgress(i);
                    try {
                        sleep(200);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }
        };

    }
    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        super.onRestart();
        finish();
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        finish();
    }
}


