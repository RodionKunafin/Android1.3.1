package com.example.android131;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    List<Pressure> list1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText topPressure = findViewById(R.id.topPressure);
                EditText lowerPressure = findViewById(R.id.lowerPressure);
                EditText pulse = findViewById(R.id.pulse);
                final CheckBox tachycardia = findViewById(R.id.tachycardia);
                EditText date = findViewById(R.id.date);
                String topPressureValue = topPressure.getText().toString();
                String lowerPressureValue = lowerPressure.getText().toString();
                String pulseValue = pulse.getText().toString();
                String dateValue = date.getText().toString();
                boolean isTachycardia = tachycardia.isChecked();

                Log.i(TAG, "Пользователь нажал кнопку сохранить");

                try {
                    Pressure value = new Pressure(Integer.parseInt(topPressureValue),lowerPressure,pulse, dateValue,isTachycardia);
                    list1.add(value);

                }
                catch (Exception ex){
                    Toast.makeText(SecondActivity.this,"Error",Toast.LENGTH_LONG).show();


                }
                /*tachycardia.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CheckBox language =(CheckBox) view;
                        boolean checked = language.isChecked();

                    }
                });*/


            }

        });
        Button btnToMainActivity = findViewById(R.id.btnToMainActivity);
        btnToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
                Log.i(TAG, "Пользователь нажал кнопку В начало");

            }
        });
        Button btnToThirdActivity = findViewById(R.id.btnToThirdActivity);
        btnToThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,thirdActivity.class);
                startActivity(intent);
                Log.i(TAG, "Пользователь нажал кнопку Далее");
            }
        });



    }
}
