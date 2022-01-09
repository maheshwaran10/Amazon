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

public class ThirdActivity extends AppCompatActivity {
    RadioGroup gender;
    TextView result;
    Button  click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        gender=(RadioGroup)findViewById(R.id.gender);
        result=(TextView) findViewById(R.id.result);
        click=(Button)findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId=gender.getCheckedRadioButtonId();

                  if (R.id.male==selectedId)
                  {
                      result.setText("male");
                      Toast.makeText(ThirdActivity.this,"male",Toast.LENGTH_SHORT).show();
                  }else
                  {
                      result.setText("female");
                      Toast.makeText(ThirdActivity.this,"female",Toast.LENGTH_SHORT).show();
                  }


              // RadioButton radioSexButton

                //radioSexButton =(RadioButton)findViewById(selectedId);


               //result.setText(radioSexButton.getText().toString());


            }
        });
    }
}