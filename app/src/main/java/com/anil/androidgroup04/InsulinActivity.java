package com.anil.androidgroup04;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class InsulinActivity extends AppCompatActivity {
    TextView displayTV, tvFirstDose, tvNextDosageHeader, tvNextDosageDate;

    RadioGroup rg_insulin;
    RadioButton rb_firstinsulin_yes, rb_firstinsulin_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insulin);

        getSupportActionBar().setTitle("Insulin Injections");
    }

    public void initViews() {

        tvFirstDose = findViewById(R.id.tv_first_insulin);

        tvNextDosageHeader = findViewById(R.id.tv_next_insulin_header);
        tvNextDosageDate = findViewById(R.id.tv_next_insulin_date);

        rg_insulin = findViewById(R.id.rg_insulin);
        rb_firstinsulin_yes = findViewById(R.id.rb_firstinsulin_yes);

    }

    public void onRadioButtonClicked(View view) {

    }
}