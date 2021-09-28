package com.strix.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {
    private Button requests;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        requests = (Button)findViewById(R.id.button6);

        requests.setOnClickListener(v -> {
            Intent intent = new Intent(FourthActivity.this, FinalActivity.class);

            startActivity (intent);
        });
    }
}