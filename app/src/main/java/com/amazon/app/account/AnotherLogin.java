package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amazon.app.R;

public class AnotherLogin extends AppCompatActivity {
    EditText name,password;
    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_login);

        name = (EditText) findViewById(R.id.person_name);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vName, vPassword;
                vName = name.getText().toString();
                vPassword = password.getText().toString();

                if (TextUtils.isEmpty(vName)) {
                    name.setError("enter userName");
                    return;
                }
                if (TextUtils.isEmpty(vPassword)) {
                    password.setError("enter password");
                    return;
                }
                if( vPassword.equals("123") &&vName.equals("mahesh"))
                {
                    Toast.makeText(AnotherLogin.this, "Login Success", Toast.LENGTH_SHORT).show();
                } else
                {
                    Toast.makeText(AnotherLogin.this, "Username password incorrect", Toast.LENGTH_SHORT).show();
                }



            }
        });




    }
    public void btn_signUpForm(View view) {
        startActivity(new Intent(getApplicationContext(),AnotherSignup.class));


    }
}