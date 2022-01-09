package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amazon.app.R;

public class CustomPrpgressBar extends AppCompatActivity {

    Button button;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_prpgress_bar);

        button=(Button)findViewById(R.id.bt_start);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               progressDialog = new ProgressDialog(CustomPrpgressBar.this);

               progressDialog.show();

               progressDialog.setContentView(R.layout.progress_dialog);


               progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        progressDialog.dismiss();
    }
}