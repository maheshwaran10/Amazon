package com.amazon.app.account;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.amazon.app.R;

public class BackActivity extends AppCompatActivity {
TextView tv=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        tv=(TextView)findViewById(R.id.title);
    }

    public void Login(View view) {
        Intent intent=new Intent(this,BackActivity1.class);
        startActivityForResult(intent,100);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            if (resultCode == RESULT_CANCELED) {
                tv.setText("Please Enter Your Name");
            } else {
                String Name = data.getStringExtra("name");
                tv.setText("Your Name : " + Name);
            }
        }
    }
}