package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button cel_to_fah;
    private Button fah_to_cel;
    private EditText input_user;
    private TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cel_to_fah=findViewById(R.id.cel_to_fah);
        fah_to_cel=findViewById(R.id.fah_to_cel);
        input_user=findViewById(R.id.input_user);
        output=findViewById(R.id.output);


        user_input();

    }

    private void user_input(){
        cel_to_fah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converterClass converterClass=new converterClass();
                double degCel=Double.parseDouble(input_user.getText().toString());
                double degFah=converterClass.cel_to_fah(degCel);
                output.setText(Double.toString(degFah));
            }
        });

        fah_to_cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converterClass converterClass=new converterClass();
                double degFah=Double.parseDouble(input_user.getText().toString());
                double degCel=converterClass.fah_to_cel(degFah);
                output.setText(Double.toString(degCel));

            }
        });
    }
}