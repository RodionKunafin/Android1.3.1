package com.example.android131;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    List<PatienInfo> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nameOfPatient = findViewById(R.id.nameOfPatient);
                EditText age = findViewById(R.id.age);
                String nameOfPatientValue = age.getText().toString();
                String ageValue = age.getText().toString();

                Log.i(TAG, "Пользователь нажал кнопку сохранить");
                try {
                    PatienInfo value = new PatienInfo(Integer.parseInt(ageValue),nameOfPatientValue);
                    list.add(value);
                }
                catch (Exception ex){
                    Toast.makeText(MainActivity.this,"Ошибка",Toast.LENGTH_LONG).show();

                }

            }
        });
        Button btnPressure = findViewById(R.id.btnPressure);
        btnPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                Log.i(TAG, "Пользователь нажал кнопку Перейти к записи давления");

            }
        });
        Button btnVitalStatistics = findViewById(R.id.btnVitalStatistics);
        btnVitalStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,thirdActivity.class);
                startActivity(intent);
                Log.i(TAG, "Пользователь нажал кнопку Перейти к жизненным показателям");
            }
        });

    }

}
