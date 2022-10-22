package com.example.demodrawable;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NinePatchAct extends AppCompatActivity {
    private String str;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_nine_patch);

        TextView textView = findViewById(R.id.textView);
        TextView tvUpSizeText = findViewById(R.id.tvUpSizeText);

        str = getResources().getString(R.string.cadena_corta);

        tvUpSizeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "abcdef";
                textView.setText(str);
            }
        });
    }
}
