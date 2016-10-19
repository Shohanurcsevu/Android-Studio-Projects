package com.example.srbiswash.routine11sb;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton btnSunday=(ImageButton)findViewById(R.id.btnSunday);

        final ImageButton btnMonday = (ImageButton) findViewById(R.id.btnMonday);

        final ImageButton btnTuesday=(ImageButton)findViewById(R.id.btnTuesday);

        final ImageButton btnWednesday=(ImageButton)findViewById(R.id.btnWednesday);

        final ImageButton btnThursday=(ImageButton)findViewById(R.id.btnThursday);

        final ImageButton btnSatueday=(ImageButton)findViewById(R.id.btnSatuerday);


          btnSunday.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent in=new Intent(MainActivity.this,Sunday.class);

                  startActivity(in);
              }
          });



        btnMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(MainActivity.this,Monday.class);

                startActivity(in1);
            }
        });

        btnTuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent (MainActivity.this, Tuesday.class);
                startActivity(in2);
            }
        });

        btnWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(MainActivity.this,Wednesday.class);
                startActivity(in3);
            }
        });

        btnThursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(MainActivity.this,Thursday.class);
                startActivity(in4);
            }
        });

        btnSatueday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 =new Intent(MainActivity.this,Satuerday.class);
                startActivity(in5);
            }
        });

    }
}
