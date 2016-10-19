package com.example.srbiswash.routine11sb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Wednesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);
        final TextView tvDigital=(TextView)findViewById(R.id.tvDDlogic);

        tvDigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Wednesday.this,DigitalLogic.class);
                startActivity(in);
            }
        });
    }
}
