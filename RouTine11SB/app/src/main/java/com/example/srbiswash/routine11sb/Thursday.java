package com.example.srbiswash.routine11sb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Thursday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday);

        final TextView tvsoftlab=(TextView)findViewById(R.id.tvsoftsoftlab);
        final TextView tvdigitallab=(TextView)findViewById(R.id.tvdigitallab);


        tvsoftlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Thursday.this,SoftwareLab.class);
                startActivity(in);
            }
        });

        tvdigitallab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(Thursday.this,DigitalLogicLab.class);
                startActivity(in2);
            }
        });

    }
}
