package com.anil.androidgroup04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView diabetesCheckBtn, bmiBtn, medicineAlertsBtn, insulinBtn, pharmacyListBtn, faqBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        getSupportActionBar().setTitle("HOME");

        diabetesCheckBtn = findViewById(R.id.diabetes_check_btn);
        bmiBtn = findViewById(R.id.bmi_btn);
        insulinBtn = findViewById(R.id.insulin_btn);
        medicineAlertsBtn = findViewById(R.id.medicine_alerts_btn);
        pharmacyListBtn = findViewById(R.id.pharmacy_near_btn);
        faqBtn = findViewById(R.id.faq_btn);
    }

    public void faqClick(View view) {
        startActivity(new Intent(MainActivity.this, FaqActivity.class));
    }
}