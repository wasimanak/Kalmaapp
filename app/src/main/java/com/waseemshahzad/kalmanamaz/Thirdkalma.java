package com.waseemshahzad.kalmanamaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Thirdkalma extends AppCompatActivity {
    ImageView btn_next,btn_prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdkalma);
        btn_next=findViewById(R.id.btn_next);
        btn_prev=findViewById(R.id.btn_prev);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Thirdkalma.this,Fourthkalma.class));
                finish();
            }
        });
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Thirdkalma.this,Secondkalma.class));
                finish();
            }
        });

    }
}