package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.amazon.app.R;

public class ToggleActivity extends AppCompatActivity {
    ToggleButton  btn;
    TextView  tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);
        btn=findViewById(R.id.btnToggle);
        tv=findViewById(R.id.txt);
    }

    public void display(View view) {
        if(view.getId()==R.id.btnToggle)
        {
            String data=btn.getText().toString();
            tv.setText("Bluetooth Button is "+data);
        }
    }
}