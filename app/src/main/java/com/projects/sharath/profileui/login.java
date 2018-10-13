package com.projects.sharath.profileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class login extends AppCompatActivity {

    private Button signUp, knowMore;
    private Button login;

    private TextView forgot;

    private TextInputEditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        signUp = findViewById(R.id.signUp);
        knowMore = findViewById(R.id.knowMore);
        login = findViewById(R.id.login);

        forgot = findViewById(R.id.forgot);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.projects.sharath.profileui.login.this, "Sign Up", Toast.LENGTH_SHORT).show();
            }
        });

        knowMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.projects.sharath.profileui.login.this, "Know More", Toast.LENGTH_SHORT).show();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte=new Intent(login.this,Home.class);
                startActivity(inte);
                Toast.makeText(com.projects.sharath.profileui.login.this, "Login", Toast.LENGTH_SHORT).show();
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(com.projects.sharath.profileui.login.this, "Forgot", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
