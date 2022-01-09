package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.amazon.app.R;

import java.util.ArrayList;

public class CustomAdapter extends AppCompatActivity {

    ListView listView;
    String[] mobileTypes = {
      "Galaxy Note 8","Mate 20 pro","Note 9 plus","Note 10 plus","iPhone X","P30 pro hauwei"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        listView=(ListView)findViewById(R.id.listView);

        ArrayAdapter adapter=new ArrayAdapter<String>(
                this,
                R.layout.listview_style,R.id.list_header,
                mobileTypes
        );
listView.setAdapter(adapter);
    }
}