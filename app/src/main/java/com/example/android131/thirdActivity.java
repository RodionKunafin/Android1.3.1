package com.example.android131;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class thirdActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";

    List<VitalStatistics> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button btnSaveOnThirdActivity = findViewById(R.id.btnSaveOnThirdActivity);
        btnSaveOnThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText weight = findViewById(R.id.weight);
                EditText steps = findViewById(R.id.steps);
                String weightValue = weight.getText().toString();
                String stepsValue = steps.getText().toString();
                Log.i(TAG, "Пользователь нажал кнопку Сохранить");

                try {
                    VitalStatistics value = new VitalStatistics(Integer.parseInt(stepsValue),weightValue);
                    list.add(value);
                }
                catch (Exception ex){
                    Toast.makeText(thirdActivity.this,"Error",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
