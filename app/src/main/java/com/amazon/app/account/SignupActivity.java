package com.amazon.app.account;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.amazon.app.LancherActivity;
import com.amazon.app.R;

public class SignupActivity extends AppCompatActivity {
    EditText name,phoneNumber,emailId,password,confirmPassword;
    TextView existingUserLogin;
    Button signUp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name = (EditText) findViewById(R.id.name);
        phoneNumber = (EditText) findViewById(R.id.phone_number);
        emailId = (EditText) findViewById(R.id.email_id);
        password = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirm_password);
        existingUserLogin = (TextView) findViewById(R.id.login);
        signUp = (Button) findViewById(R.id.signup);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vName, vPhoneNumber, vEmailId, vPassword, vConfirmPassword;
                vName = name.getText().toString();
                vPhoneNumber = phoneNumber.getText().toString();
                vEmailId = emailId.getText().toString();
                vPassword = password.getText().toString();
                vConfirmPassword = confirmPassword.getText().toString();
                if (TextUtils.isEmpty(vName)) {
                    name.setError("Enter your name");
                    return;
                }
                if (TextUtils.isEmpty(vPhoneNumber)) {
                    phoneNumber.setError("Enter your phone number");
                    return;
                }
                if (TextUtils.isEmpty(vEmailId)) {
                    emailId.setError("Enter your Email id");
                    return;
                }
                if (TextUtils.isEmpty(vPassword)) {
                    password.setError("Enter your password");
                    return;
                }
                if (TextUtils.isEmpty(vConfirmPassword)) {
                    confirmPassword.setError("Enter your confirm password");
                    return;
                }
                if (!vConfirmPassword.equals(vPassword)) {
                    confirmPassword.setError("Confirm password not matched");
                    return;
                }
                Toast.makeText(SignupActivity.this, "Sucessfully registered", Toast.LENGTH_SHORT).show();


            }
        });
    }}