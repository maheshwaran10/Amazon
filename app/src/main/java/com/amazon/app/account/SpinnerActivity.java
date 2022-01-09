package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.amazon.app.R;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    Button button;
    String [] listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        listItems=getResources().getStringArray(R.array.technologies);
        spinner=(Spinner)findViewById(R.id.spinner3);
        button=(Button)findViewById(R.id.button3);

        ArrayAdapter adapter=new ArrayAdapter(SpinnerActivity.this, android.R.layout.simple_spinner_item,listItems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result=spinner.getSelectedItem().toString();
                Toast.makeText(SpinnerActivity.this,result,Toast.LENGTH_SHORT).show();
            }
        });

    }
}