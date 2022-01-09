package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.amazon.app.R;

public class ProgressBarActivity extends AppCompatActivity {
    Button  b1,b2;
    ProgressBar  p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        p1=findViewById(R.id.p1);

        p1.setVisibility(View.INVISIBLE);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                p1.setVisibility(View.VISIBLE);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1.setVisibility(View.INVISIBLE);
                p1.invalidate();
            }
        });
    }
}