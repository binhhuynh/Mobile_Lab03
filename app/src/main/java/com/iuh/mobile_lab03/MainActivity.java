package com.iuh.mobile_lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgView = findViewById(R.id.imageView2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int image = bundle.getInt("img");
            imgView.setImageResource(image);
        }
    }

    public void onClickChooseColor(View view) {
        Intent colorIntent = new Intent(this, ColorActivity.class);
        startActivity(colorIntent);
    }

}