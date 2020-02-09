package com.example.datetimepickerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DatePicker extends AppCompatActivity {


    TextView textView;
    android.widget.DatePicker datePicker;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        textView = (TextView) findViewById(R.id.textView);
        datePicker = (android.widget.DatePicker) findViewById(R.id.datePicker);
        button = (Button) findViewById(R.id.button);

        textView.setText("Current Date: " + getCurrentDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("Change date : " + getCurrentDate());
            }
        });

    }

    private String getCurrentDate() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear());
        return stringBuilder.toString();
    }


}

