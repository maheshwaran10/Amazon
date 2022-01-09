package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.amazon.app.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FloatingButton extends AppCompatActivity {

    FloatingActionButton fab1, fab2, fab3;
    Boolean isTrue = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal);
        fab1 = findViewById(R.id.add);
        fab2 = findViewById(R.id.phone);
        fab3 = findViewById(R.id.shop);

        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        Animation rotateBack = AnimationUtils.loadAnimation(this, R.anim.rotate_back);
        Animation Open = AnimationUtils.loadAnimation(this, R.anim.fab_open);
        Animation Close = AnimationUtils.loadAnimation(this, R.anim.fab_close);

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isTrue) {
                    fab1.startAnimation(rotate);
                    fab2.startAnimation(Open);
                    fab3.startAnimation(Open);
                    fab2.setVisibility(View.VISIBLE);
                    fab3.setVisibility(View.VISIBLE);
                    fab2.setClickable(true);
                    fab3.setClickable(true);
                    isTrue = false;

                } else {
                    fab1.startAnimation(rotateBack);
                    fab2.startAnimation(Close);
                    fab3.startAnimation(Close);
                    fab2.setVisibility(View.INVISIBLE);
                    fab3.setVisibility(View.INVISIBLE);
                    fab2.setClickable(false);
                    fab3.setClickable(false);
                    isTrue = true;
                }
            }


        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FloatingButton.this, Activity1.class);
                startActivity(intent);
            }
        });

        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FloatingButton.this, Activity2.class);
                startActivity(intent);
            }
        });
    }
}