package com.waseemshahzad.kalmanamaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Kalma extends AppCompatActivity {
    Button first_kalma,second_kalma,third_kalma,fourth_kalma,fifth_kalma,sixth_kalma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma);
        first_kalma=findViewById(R.id.first_kalma);
        second_kalma=findViewById(R.id.second_kalma);
        third_kalma=findViewById(R.id.third_kalma);
        fourth_kalma=findViewById(R.id.fourth_kalma);
        fifth_kalma=findViewById(R.id.fifth_kalma);
        sixth_kalma=findViewById(R.id.sixth_kalma);

        first_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalma.this,Firstkalma.class));

            }
        });

        second_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalma.this,Secondkalma.class));

            }
        });

        third_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalma.this,Thirdkalma.class));

            }
        });

        fourth_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalma.this,Fourthkalma.class));

            }
        });

        fifth_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalma.this,Fifthkalma.class));

            }
        });

        sixth_kalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalma.this,Sixthkalma.class));

            }
        });


    }
}