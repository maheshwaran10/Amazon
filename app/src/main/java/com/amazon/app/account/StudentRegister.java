package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amazon.app.R;
import com.google.android.material.textfield.TextInputEditText;

public class StudentRegister extends AppCompatActivity {
    EditText t1,t2,t3;
    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);

        t1=(EditText) findViewById(R.id.name);
        t2=(EditText)findViewById(R.id.email);
        t3=(EditText)findViewById(R.id.course);

        button=(Button) findViewById(R.id.button);
        button1=(Button)findViewById(R.id.button1);

    }

    public void addRecord(View view)
    {
        DbManager db=new DbManager(this);

        String res= db.addRecord(t1.getText().toString(),t2.getText().toString(),t3.getText().toString());

        Toast.makeText(this,res,Toast.LENGTH_SHORT).show();

        t1.setText("");
        t2.setText("");
        t3.setText("");


    }


}