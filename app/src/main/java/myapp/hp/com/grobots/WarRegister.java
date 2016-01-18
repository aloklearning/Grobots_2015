package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class WarRegister extends Activity implements AdapterView.OnItemSelectedListener{
    
    Button w;
    String s1;
    Spinner s;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war_register);
        w = (Button) findViewById(R.id.WRButton1);
        s = (Spinner) findViewById(R.id.WRSpinner);
        ed1 = (EditText) findViewById(R.id.WREditText1);
        ed2 = (EditText) findViewById(R.id.WREditText2);
        ed3 = (EditText) findViewById(R.id.WREditText3);
        ed4 = (EditText) findViewById(R.id.WREditText4);
        ed5 = (EditText) findViewById(R.id.WREditText5);
        ed6 = (EditText) findViewById(R.id.WREditText6);
        ed7 = (EditText) findViewById(R.id.WREditText7);

        s.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        String[] str = {"Select Members", "1", "2", "3", "4", "5", "6"};
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, str);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(aa);

        w.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if ((s1.toString().equals("Select Members"))) {
                    Toast.makeText(getApplicationContext(),
                            "Members not selected please fill", Toast.LENGTH_LONG).show();
                } else if ((ed1.getText().toString().equals(""))) {
                    Toast.makeText(getApplicationContext(),
                            "Leader's name left please fill", Toast.LENGTH_LONG).show();
                } else if ((ed2.getText().toString().equals(""))) {
                    Toast.makeText(getApplicationContext(),
                            "Team Name left please fill", Toast.LENGTH_LONG).show();
                } else if ((ed3.getText().toString().equals(""))) {
                        Toast.makeText(getApplicationContext(),
                                "Contact left please fill", Toast.LENGTH_LONG).show();
                } else if ((ed4.getText().toString().equals("")) || (ed5
                        .getText().toString().equals("")) || (ed6.getText()
                        .toString().equals("")) || (ed7.getText().toString().equals(""))) {
                    Toast.makeText(getApplicationContext(),
                            " Detail Entry left please fill", Toast.LENGTH_LONG).show();
                } else {
                    Intent emailintent = new Intent(Intent.ACTION_SEND);
                    emailintent.putExtra(Intent.EXTRA_EMAIL,
                            new String[]{"grobots.srmgpc@gmail.com"});
                    emailintent.putExtra(Intent.EXTRA_SUBJECT, "ROBOCALYPSE Registration"
                            + " " + "via Android App");
                    emailintent.putExtra(Intent.EXTRA_TEXT,
                            "Number of Memebers:" + " " + s1 + "\n\nLEADER'S NAME:"
                                    + " " + ed1.getText().toString()
                                    + "\n\nTEAM NAME:" + " " + ed2.getText().toString()
                                    + "\n\nCONTACT NUMBER:"
                                    + " " + ed3.getText().toString()
                                    + "\n\nCOLLEGE NAME:"
                                    + " " + ed4.getText().toString() + " "
                                    + "\n\nNAME OF ALL MEMBERS:" + " " + ed5.getText().toString()
                                    + " " + "\nCONTACT OF ALL MEMBERS:" + " " + ed6.getText().toString() +
                                    "\n\nBRANCH OF ALL MEMBERS:" + " " + ed7.getText().toString());
                    emailintent.setType("message/rfc882");
                    startActivity(Intent.createChooser(emailintent,
                            "Choose email client"));
                }
            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> pWRent, View view, int position, long id) {
        s1 = s.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> pWRent) {

    }
    
}
