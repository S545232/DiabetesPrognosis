package com.anil.androidgroup04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DiabetesCheckActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup rg_urination, rg_thirst, rg_fatigue, rg_vision, rg_hunger, rg_weight, rg_wounds, rg_numbness;
    RadioButton
            rb_urination_yes, rb_urination_no,
            rb_thirst_yes, rb_thirst_no,
            rb_fatigue_yes, rb_fatigue_no,
            rb_vision_yes, rb_vision_no,
            rb_hunger_yes, rb_hunger_no,
            rb_weight_yes, rb_weight_no,
            rb_wounds_yes, rb_wounds_no,
            rb_numbness_yes, rb_numbness_no;

    Button predictBtn;
    TextView resultTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes_check);

        getSupportActionBar().setTitle("Diabetes Check");

        initViews();
    }

    public void initViews() {
        rg_urination = findViewById(R.id.rg_urination);
        rg_thirst = findViewById(R.id.rg_thirst);
        rg_fatigue = findViewById(R.id.rg_fatigue);
        rg_vision = findViewById(R.id.rg_vision);
        rg_hunger = findViewById(R.id.rg_hunger);
        rg_weight = findViewById(R.id.rg_weight);
        rg_wounds = findViewById(R.id.rg_wounds);
        rg_numbness = findViewById(R.id.rg_numbness);

        rb_urination_yes = findViewById(R.id.rb_urination_yes);
        rb_urination_no = findViewById(R.id.rb_urination_no);
        rb_thirst_yes = findViewById(R.id.rb_thirst_yes);
        rb_thirst_no = findViewById(R.id.rb_thirst_no);
        rb_fatigue_yes = findViewById(R.id.rb_fatigue_yes);
        rb_fatigue_no = findViewById(R.id.rb_fatigue_no);
        rb_vision_yes = findViewById(R.id.rb_vision_yes);
        rb_vision_no = findViewById(R.id.rb_vision_no);
        rb_hunger_yes = findViewById(R.id.rb_hunger_yes);
        rb_hunger_no = findViewById(R.id.rb_hunger_no);
        rb_weight_yes = findViewById(R.id.rb_weight_yes);
        rb_weight_no = findViewById(R.id.rb_weight_no);
        rb_wounds_yes = findViewById(R.id.rb_wounds_yes);
        rb_wounds_no = findViewById(R.id.rb_wounds_no);
        rb_numbness_yes = findViewById(R.id.rb_numbness_yes);
        rb_numbness_no = findViewById(R.id.rb_numbness_no);

        predictBtn = findViewById(R.id.btn_predict);
        resultTv = findViewById(R.id.tv_predict);

        predictBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (onRadioAllCheck()) {
            predictResult();
        }
    }

    public boolean onRadioAllCheck() {
        if (rg_urination.getCheckedRadioButtonId() == -1
                || rg_thirst.getCheckedRadioButtonId() == -1
                || rg_fatigue.getCheckedRadioButtonId() == -1
                || rg_hunger.getCheckedRadioButtonId() == -1
                || rg_vision.getCheckedRadioButtonId() == -1
                || rg_hunger.getCheckedRadioButtonId() == -1
                || rg_weight.getCheckedRadioButtonId() == -1
                || rg_wounds.getCheckedRadioButtonId() == -1
                || rg_numbness.getCheckedRadioButtonId() == -1) {
            Toast.makeText(getApplicationContext(), "Please choose all the fields", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void predictResult() {
//        if (rb_urination_yes.equalsIgnoreCase("yes") || cret_double >= 5 || oxy_double <= 60 || chron.equalsIgnoreCase("yes")) {
//
//            tv_predict.setText("Covid Probability: High");
//        } else {
//            //calculating count for age
//            if (age_int > 60) {
//                age_count = 100;
//            } else if (age_int > 15 && age_int <= 60)
//                age_count = 50;
//            else
//                age_count = 10;
//
//            //calculating count for temperature
//            if (temp_double > 102)
//                temp_count = 100;
//            else if (temp_double > 99 && temp_double <= 102)
//                temp_count = 50;
//            else
//                temp_count = 10;
//
//            //calculating count for bp
//            calcBp();
//
//            //calculating count for cough
//            if (rb_cough_high.isChecked())
//                cough_count = 100;
//            else if (rb_cough_mod.isChecked())
//                cough_count = 50;
//            else
//                cough_count = 10;
//
//            //calculating count for head ache
//            if (rb_headache_high.isChecked())
//                headache_count = 100;
//            else if (rb_headache_mod.isChecked())
//                headache_count = 50;
//            else
//                headache_count = 10;
//            //getting Final result
//            tv_predict.setTextColor(this.getResources().getColor(R.color.design_default_color_primary_variant));
        resultTv.setText(finalResult());


//        }

    }

    public String finalResult() {
//        String final_result;
//        double result = (age_count + temp_count + bp_count + cough_count + headache_count) / 5.0;
//        if (result >= 75)
//            return "Covid Probability: High";
//        else if (result >= 50 && result < 75)
//            return "Covid Probability: Moderate";
//        else

        if (rb_urination_yes.isChecked() || rb_weight_yes.isChecked() || rb_wounds_yes.isChecked()) {
            return "Diabetes Probability: High";

        } else if (rb_thirst_yes.isChecked() || rb_vision_yes.isChecked() || rb_hunger_yes.isChecked()) {
            return "Diabetes Probability: Moderate";

        } else if (rb_urination_no.isChecked() || rb_thirst_no.isChecked() || rb_fatigue_no.isChecked()
                || rb_vision_no.isChecked() || rb_hunger_no.isChecked() || rb_weight_no.isChecked()
                || rb_wounds_no.isChecked() || rb_numbness_no.isChecked()) {
            return "Diabetes Probability: No Symptoms";

        } else {
            return "Diabetes Probability: Low";
        }

    }

}
