package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.amazon.app.R;

public class RecyclerView1 extends AppCompatActivity {

    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view1);

        rcv=(RecyclerView)findViewById(R.id.recycler1);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        String arr[]={"c","c++","PHP","Java",".NEt","JQuery","c","c++","PHP","Java",".NEt","JQuery"};
        rcv.setAdapter(new myAdapter(arr));


    }
}