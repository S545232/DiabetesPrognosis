package com.anil.androidgroup04;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FaqActivity extends AppCompatActivity {
    TextView textlink,txt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        getSupportActionBar().setTitle("FAQ's");

        textlink = findViewById(R.id.textViewLink);
        textlink.setMovementMethod(LinkMovementMethod.getInstance());
        txt=findViewById(R.id.textViLink);
        txt.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
