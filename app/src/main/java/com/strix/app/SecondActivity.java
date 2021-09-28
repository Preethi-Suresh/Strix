package com.strix.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button request;
    private  Button create;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        request = (Button)findViewById(R.id.button2);
        create = (Button) findViewById(R.id.button4);

        create.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

            startActivity (intent);
        });

        request.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, FourthActivity.class);

            startActivity (intent);
                   });
    }
}