package com.example.android131;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Pressure {
    int topPressure;
    EditText lowerPressure;
    EditText pulse;
    String date;
    boolean tachycardia;

    public Pressure(int topPressure, EditText lowerPressure, EditText pulse, String date, boolean tachycardia) {
        this.topPressure = topPressure;
        this.lowerPressure = lowerPressure;
        this.pulse = pulse;
        this.date = date;
        this.tachycardia = tachycardia;

    }
}
