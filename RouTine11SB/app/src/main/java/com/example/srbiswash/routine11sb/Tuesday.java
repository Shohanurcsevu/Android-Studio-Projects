package com.example.srbiswash.routine11sb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tuesday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);
     final  TextView softlab=(TextView)findViewById(R.id.tvSoftwarelab);

        final TextView tvsta=(TextView)findViewById(R.id.tvsta);
        final  TextView tvdigitallogic=(TextView)findViewById(R.id.tvDDlogic);


        softlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Tuesday.this,SoftwareLab.class);
                startActivity(in);
            }
        });

        tvsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Tuesday.this,StatisticsActivity.class);
                startActivity(in1
                );
            }
        });
        tvdigitallogic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(Tuesday.this,DigitalLogic.class);
                startActivity(in2);
            }
        });

    }
}
