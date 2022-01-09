package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.amazon.app.R;

public class BackActivity1 extends AppCompatActivity {

    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back1);
        e1=(EditText)findViewById(R.id.text);
    }

    public void BackTo(View view) {
        String name=e1.getText().toString().trim();
        Intent i=new Intent();
        if(name.length()>0)
        {
            setResult(RESULT_OK,i);
            i.putExtra("name",name);
        }
        else
        {
            setResult(RESULT_CANCELED,i);
        }
        finish();
    }
}