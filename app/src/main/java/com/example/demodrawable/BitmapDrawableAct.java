package com.example.demodrawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class BitmapDrawableAct extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_bitmap);

        ImageView imvDrawable = findViewById(R.id.imvDrawable);

        Resources resources = getResources();
        Drawable drawable = ResourcesCompat.getDrawable(resources,R.drawable.image_eat_rice,null);
        imvDrawable.setImageDrawable(drawable);
        
    }
}
