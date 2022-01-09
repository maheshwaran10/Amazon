package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import com.amazon.app.R;

import org.intellij.lang.annotations.Language;

public class ExposedDropdown extends AppCompatActivity {

    String[] listItems;

    AutoCompleteTextView auto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exposed_dropdown);
        auto=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);





    }
}