package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button B ;
    EditText ET;
    TextView TV ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B=  (Button) findViewById(R.id.hbutton);
        ET= (EditText)findViewById(R.id.personName);
        TV= (TextView) findViewById(R.id.textView2);
// Intent i= getIntent();


        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String s= ET.getText().toString();
                // sendData(s);
                TV.setText("Hello,  "+s);
            }
        });
    }
}