package com.example.srbiswash.astv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername=(EditText)findViewById(R.id.etUsername);

        final EditText etPassword=(EditText)findViewById(R.id.etPassword);

        final Button btnlogin=(Button)findViewById(R.id.btnLogin);

        final TextView tvRegistar=(TextView)findViewById(R.id.tvRegistar);

        tvRegistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registarintent=new Intent(LoginActivity.this, RegistarActivity.class);
                LoginActivity.this.startActivity(registarintent);

            }
        });


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attendence=new Intent(LoginActivity.this,AttendenceActivity.class);
                LoginActivity.this.startActivity(attendence);
            }
        });
    }
}
