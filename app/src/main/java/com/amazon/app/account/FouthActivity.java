package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.amazon.app.R;

public class FouthActivity extends AppCompatActivity {
    RadioGroup district;
    TextView result;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fouth);
            district = (RadioGroup) findViewById(R.id.district);
            result = (TextView) findViewById(R.id.result);
            click = (Button) findViewById(R.id.click);
            click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (district.getCheckedRadioButtonId() != -1) {
                        int selectedId = district.getCheckedRadioButtonId();
                        RadioButton radioButton = (RadioButton) findViewById(selectedId);
                        result.setText(radioButton.getText().toString());
                        String Vdistrict = radioButton.getText().toString();
                        if (Vdistrict.equals("chennai")) {
                            Toast.makeText(FouthActivity.this, "Answer is Correct", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(FouthActivity.this, "Answer is inCorrect", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(FouthActivity.this, "Please select your Answer", Toast.LENGTH_SHORT).show();
                    }

                }
            });
    }}

