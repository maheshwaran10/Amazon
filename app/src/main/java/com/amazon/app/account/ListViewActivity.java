package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.amazon.app.R;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ListView list;
    ArrayList<String> list1;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        list=(ListView)findViewById(R.id.list);

        list1=new ArrayList<String>();
        list1.add("Monday");
        list1.add("Tuesday");
        list1.add("Wednesday");
        list1.add("Thursday");
        list1.add("Friday");
        list1.add("Saturday");
        list1.add("Sunday");
        adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,list1);
        list.setAdapter(adapter);
    }
}