package com.strix.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView Logo;
    private ImageView bg;
    private EditText Name;
    private EditText Password;
    private Button Login;
    private int counter=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView Logo = findViewById(R.id.imageView2);
        ImageView bg = findViewById(R.id.imageView3);
        EditText Name = findViewById(R.id.editTextTextPersonName);
        EditText Password = findViewById(R.id.editTextTextPassword);
        Button Login = findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });
}
    private void validate(String Username,String Userpassword){
        if((Username.equals("Admin")) && (Userpassword.equals("1111"))){
            Intent intent = new Intent (MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }else{
            counter--;

            if(counter == 0) {

                Intent intent = new Intent (MainActivity.this,otp.class);
                startActivity(intent);
            }
        }
    }
}