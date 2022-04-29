package com.anil.androidgroup04;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class InsulinActivity extends AppCompatActivity {
    TextView displayTV, tvFirstDose, tvSecondDose, tvNextDosageHeader, tvNextDosageDate;

    RadioGroup rgFirstDose, rgSecondDose;
    RadioButton rbModernaVaccine, rbJJVaccine;

    TextInputLayout tilFirstDose, tilSecondDose;
    TextInputEditText tieFirstDose, tieSecondDose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insulin);

        getSupportActionBar().setTitle("Insulin Injections");
    }
    public void initViews(){

        tvFirstDose = findViewById(R.id.tv_first_dose);
        tvSecondDose = findViewById(R.id.tv_seconddose);

        rgFirstDose = findViewById(R.id.rg_firstdose);
        rgSecondDose = findViewById(R.id.rg_seconddose);

        tilFirstDose = findViewById(R.id.til_firstdose);
        tilSecondDose = findViewById(R.id.til_seconddose);

        tvNextDosageHeader = findViewById(R.id.tv_next_dosage_header);
        tvNextDosageDate = findViewById(R.id.tv_next_dosage_date);

        tieFirstDose = findViewById(R.id.tie_firstdose);

        tieSecondDose = findViewById(R.id.tie_second_dose);

    }
}