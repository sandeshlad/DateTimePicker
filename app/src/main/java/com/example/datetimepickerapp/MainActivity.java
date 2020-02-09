package com.example.datetimepickerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioGroup=findViewById(R.id.groupradio);




    }

    public void checkDate(View view) {

        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

       Toast.makeText(this,"Selected Radio Button :"+radioButton.getText(),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this,DatePicker.class));




    }

    public void checkTime(View view) {

        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        Toast.makeText(this,"Selected Radio Button :"+radioButton.getText(),Toast.LENGTH_SHORT).show();

        startActivity(new Intent(MainActivity.this,TimePicker.class));


    }
}
