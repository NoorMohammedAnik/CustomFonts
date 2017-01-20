package com.noor.customfonts;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClick,btnReset,btnExit;
    EditText input;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick=(Button)findViewById(R.id.btnSetText);
        btnReset=(Button)findViewById(R.id.btnReset) ;
        btnExit=(Button)findViewById(R.id.btnExit) ;
        input=(EditText)findViewById(R.id.editTextInput);
        text=(TextView)findViewById(R.id.textView);

       // Typeface tf = Typeface.createFromAsset(getAssets(),"SolaimanLipi.ttf");
        Typeface tf = Typeface.createFromAsset(getAssets(), "Algerian.ttf");
        text.setTypeface(tf);
        input.setTypeface(tf);


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                String s=input.getText().toString();
                text.setText(s);
                //Todo add text here
            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input.setText(" ");
                text.setText("TEXT");

            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               finish();
            }
        });
    }
}
