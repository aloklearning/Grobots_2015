package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class RegisterActivity extends Activity {

    Button r1,r2,r3,r4,r5,r6,r7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        r1 = (Button) findViewById(R.id.RegisterButton1);
        r2 = (Button) findViewById(R.id.RegisterButton2);
        r3 = (Button) findViewById(R.id.RegisterButton3);
        r4 = (Button) findViewById(R.id.RegisterButton4);
        r5 = (Button) findViewById(R.id.RegisterButton5);
        r6 = (Button) findViewById(R.id.RegisterButton6);
        r7 = (Button) findViewById(R.id.RegisterButton7);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,HowToRegister.class);
                startActivity(intent);
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,SkyRegister.class);
                startActivity(intent);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,AquaRegister.class);
                startActivity(intent);
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,SprintRegister.class);
                startActivity(intent);
            }
        });
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,WarRegister.class);
                startActivity(intent);
            }
        });
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,UvaanRegister.class);
                startActivity(intent);
            }
        });
        r7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,TechdRegister.class);
                startActivity(intent);
            }
        });
    }
}
