package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.amazon.app.MyAdapter;
import com.amazon.app.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    EditText et;
    Button b;
    RecyclerView recyclerView;
    ArrayList<String> message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        iniVar();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=et.getText().toString();
                message.add(text);
                MyAdapter myAdapter=new MyAdapter(message);
                recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));
                recyclerView.setAdapter(myAdapter);
            }
        });
    }

    @SuppressLint("WrongViewCast")
    private void iniVar() {
        message=new ArrayList<String>();
        et=findViewById(R.id.text);
        b=findViewById(R.id.btn);
        recyclerView = findViewById(R.id.recycler);
    }
}