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
    TextView displayTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insulin);

        getSupportActionBar().setTitle("Insulin Injections");

        initViews();
    }

    public void initViews() {
        displayTV = findViewById(R.id.tv_result);
    }

    public void onRadioButtonClicked(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which RadioButton was clicked
        switch (view.getId()) {
            case R.id.rb_firstinsulin_yes:
                if (checked) {
                    displayTV.setText("Please take the next insulin after 6 hours of gap from the first insulin.");
                }
                break;

            case R.id.rb_firstinsulin_no:
                if (checked) {
                    displayTV.setText("Please take the first insulin for today as soon as possible.\nTo avoid the severe health conditions");
                }
                break;
        }
    }
}