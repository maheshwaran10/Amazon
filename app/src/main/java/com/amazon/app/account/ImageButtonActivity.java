package com.amazon.app.account;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.amazon.app.R;

public class ImageButtonActivity extends AppCompatActivity {
    ImageButton img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);

        img=(ImageButton)findViewById(R.id.button);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Image Button is Clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
