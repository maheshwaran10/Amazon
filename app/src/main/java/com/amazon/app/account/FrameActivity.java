package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.amazon.app.R;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        FrameLayout frameLayout=findViewById(R.id.frame_layout);
        frameLayout.setBackgroundColor(Color.rgb(245,222,179));

    }
}