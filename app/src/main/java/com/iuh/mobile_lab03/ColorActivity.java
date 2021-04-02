package com.iuh.mobile_lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {
    private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }

    public void getPhoneInfo(View view) {
        Button btnCyan = (Button) findViewById(R.id.btnCyan);
        Button btnRed = (Button) findViewById(R.id.btnRed);
        Button btnBlack = (Button) findViewById(R.id.btnBlack);
        Button btnBlue = (Button) findViewById(R.id.btnBlue);
        TextView txtColor = (TextView) findViewById(R.id.txtPhoneColor);
        TextView txtSupplier = (TextView) findViewById(R.id.txtPhoneSupplier);
        TextView txtPrice = (TextView) findViewById(R.id.txtPhonePrice);
        ImageView phoneImg = (ImageView) findViewById(R.id.phoneImg);
        if (btnCyan.isPressed()) {
            image = R.drawable.vs_bac;
            phoneImg.setImageDrawable(getResources().getDrawable(R.drawable.vs_bac));
            txtColor.setText("Màu: Bạc");
            txtSupplier.setText("Cung cấp bởi Tiki Trading");
            txtPrice.setText("1.790.000 đ");
        } else if (btnRed.isPressed()) {
            image = R.drawable.vs_red_a;
            phoneImg.setImageDrawable(getResources().getDrawable(R.drawable.vs_red_a));
            txtColor.setText("Màu: Đỏ");
            txtSupplier.setText("Cung cấp bởi Tiki Trading");
            txtPrice.setText("1.790.000 đ");
        } else if (btnBlack.isPressed()) {
            image = R.drawable.vsmart_black_star;
            phoneImg.setImageDrawable(getResources().getDrawable(R.drawable.vsmart_black_star));
            txtColor.setText("Màu: Đen");
            txtSupplier.setText("Cung cấp bởi Tiki Trading");
            txtPrice.setText("1.790.000 đ");
        } else {
            image = R.drawable.vsmart_live_xanh;
            phoneImg.setImageDrawable(getResources().getDrawable(R.drawable.vsmart_live_xanh));
            txtColor.setText("Màu: Xanh");
            txtSupplier.setText("Cung cấp bởi Tiki Trading");
            txtPrice.setText("1.790.000 đ");
        }
    }

    public void sendImg(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("img", image);
        startActivity(intent);
    }
}