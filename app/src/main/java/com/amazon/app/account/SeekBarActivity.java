package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import com.amazon.app.R;

public class SeekBarActivity extends AppCompatActivity {
    private Button b1;
    private SeekBar s1;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        s1=findViewById(R.id.s1);
        b1=findViewById(R.id.b1);
        a=0;
        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int progress=s1.getProgress();
                Toast.makeText(SeekBarActivity.this,String.valueOf(progress),Toast.LENGTH_SHORT).show();
            }
        });

        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                a=i;


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarActivity.this,String.valueOf(a),Toast.LENGTH_SHORT).show();
            }
        });
    }
}