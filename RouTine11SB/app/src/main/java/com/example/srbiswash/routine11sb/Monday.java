package com.example.srbiswash.routine11sb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Monday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);

        final TextView tvnetlab=(TextView)findViewById(R.id.tvNetlab);


        tvnetlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Monday.this,NetworkingLab.class);

                startActivity(in);
            }
        });
    }
}
