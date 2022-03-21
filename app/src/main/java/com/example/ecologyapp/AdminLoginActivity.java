package com.example.ecologyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class AdminLoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button loginbutton;
    private TextView wrongcredentails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginbutton = findViewById(R.id.loginbutton);
        wrongcredentails = findViewById(R.id.wrongcredentials);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String pass = password.getText().toString();
                if(name.equals("ReLoF") && pass.equals("environment123")){
                    wrongcredentails.setText("");
                    Intent intent = new Intent(AdminLoginActivity.this, MainAdminActivity.class);
                    startActivity(intent);
                }
                else{
                    wrongcredentails.setText("Wrong Credentials");
                }
            }
        });
    }
}