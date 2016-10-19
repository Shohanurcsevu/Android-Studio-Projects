package com.example.srbiswash.routine11sb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sunday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday);

        final TextView thSta=(TextView)findViewById(R.id.tvSTA);
        final TextView tvNet=(TextView)findViewById(R.id.tvNET);


        thSta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Sunday.this, StatisticsActivity.class);

                startActivity(in);
            }
        });
        tvNet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 =new Intent(Sunday.this,NetWorking.class);
                startActivity(in2);
            }
        });
    }
}
