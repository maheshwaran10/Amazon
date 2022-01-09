package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.amazon.app.R;

public class SecondActivity extends AppCompatActivity {
    EditText Name, Email, Age, Gender, Address, MobileNumber;
    Button Cancel, SignUp;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Name = (EditText) findViewById(R.id.name);
        Email = (EditText) findViewById(R.id.email_id);
        Age = (EditText) findViewById(R.id.age);
        Gender = (EditText) findViewById(R.id.gender);
        Address = (EditText) findViewById(R.id.address);
        MobileNumber = (EditText) findViewById(R.id.phone_number);
        Cancel = (Button) findViewById(R.id.cancel_button);
        SignUp = (Button) findViewById(R.id.signup);
        logo=(ImageView) findViewById(R.id.imageView);



        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String VName, VEmail, VAge, VGender, VAddress, VMobileNumber;
                VName = Name.getText().toString();
                VEmail = Email.getText().toString();
                VAge = Age.getText().toString();
                VGender = Gender.getText().toString();
                VAddress = Address.getText().toString();
                VMobileNumber = MobileNumber.getText().toString();

                if (TextUtils.isEmpty(VName)) {
                    Name.setError("Enter your name");
                    return;
                }
                if (TextUtils.isEmpty(VEmail)) {
                    Email.setError("Enter your Email id");
                    return;
                }
                if (TextUtils.isEmpty(VAge)) {
                    Age.setError("Enter your Age");
                    return;
                }
                if (TextUtils.isEmpty(VGender)) {
                    Gender.setError("Enter your Gender");
                    return;
                }
                if (TextUtils.isEmpty(VAddress)) {
                    Address.setError("Enter your Postal Address");
                    return;
                }
                if (TextUtils.isEmpty(VMobileNumber)) {
                    MobileNumber.setError("Enter your Phone Number");
                    return;
                }
                Toast.makeText(SecondActivity.this, "Sucessfully registered", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

