package com.anil.androidgroup04;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MedicineAlertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicinealerts);

        getSupportActionBar().setTitle("Medicine Alerts");
    }
}
