package com.example.srbiswash.astv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar);


        final EditText etName=(EditText)findViewById(R.id.etName);
        final EditText etUsername=(EditText)findViewById(R.id.etUsername);
        final EditText etPassword=(EditText)findViewById(R.id.etPassword);
        final EditText etage=(EditText)findViewById(R.id.etAge);
        final Button btnRegistar=(Button)findViewById(R.id.btnRegister);
    }
}
