package com.strix.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class otp extends AppCompatActivity {
    private Button otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        otp = (Button)findViewById(R.id.button2);
        otp.setOnClickListener(v -> {
            Intent intent = new Intent(otp.this, SecondActivity.class);

            startActivity (intent);
        });
    }
}