package com.example.demodrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        findViewById(R.id.tvBitmap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainAct.this, BitmapDrawableAct.class));
            }
        });

        findViewById(R.id.tvNinePatch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainAct.this, NinePatchDrawableAct.class));
            }
        });

        findViewById(R.id.tvVector).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainAct.this, VectorDrawableAct.class));
            }
        });

        findViewById(R.id.tvShape).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainAct.this,ShapeDrawableAct.class));
            }
        });

    }
}