package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.amazon.app.R;

import java.util.ArrayList;
import java.util.List;

public class AnotherSignup extends AppCompatActivity {
    EditText name, phoneNumber, email,address, password;
    RadioGroup gender;
    Button register;
    List<String> language;
    List<UserModel> users =new ArrayList<>();
    Spinner spinnerlanguage;
    TextView title;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_signup);

        name = (EditText) findViewById(R.id.person_name);
        phoneNumber = (EditText) findViewById(R.id.phone_number);
        email = (EditText) findViewById(R.id.email_id);
        address = (EditText) findViewById(R.id.address);
        password = (EditText) findViewById(R.id.password);
         register= (Button) findViewById(R.id.register);


        gender = (RadioGroup) findViewById(R.id.gender);

        spinnerlanguage = (Spinner) findViewById(R.id.language);


        language = new ArrayList<String>();
        language.add("Select your language");
        language.add("Tamil");
        language.add("Telungu ");
        language.add("Kannadam");
        language.add("Malayaalam");
        language.add("Hindi");
        language.add("English");

        ArrayAdapter<String> languageAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, language);
        languageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerlanguage.setAdapter(languageAdapter);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vName, vPhoneNumber, vEmail, vAddress, vPassword,vGender,vLanguage = null;

                vName = name.getText().toString();
                vPhoneNumber = phoneNumber.getText().toString();
                vEmail = email.getText().toString();
                vAddress = address.getText().toString();
                vPassword = password.getText().toString();


                if (TextUtils.isEmpty(vName)) {
                    name.setError("Enter your name");
                    return;
                }
                if (TextUtils.isEmpty(vPhoneNumber)) {
                    phoneNumber.setError("Enter your Phone Number");
                    return;
                }

                if (TextUtils.isEmpty(vEmail)) {
                    email.setError("Enter your Email id");
                    return;
                }
                if (TextUtils.isEmpty(vAddress)) {
                    address.setError("Enter your  Address");
                    return;
                }

                if (TextUtils.isEmpty(vPassword)) {
                    password.setError("Enter your password");
                    return;

                }




                if (gender.getCheckedRadioButtonId() != -1) {

                    int selectedId=gender.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(selectedId);
                    vGender = radioButton.getText().toString();


                } else {
                    Toast.makeText(AnotherSignup.this, "Please select your Gender", Toast.LENGTH_SHORT).show();
                    return;
                }





                Toast.makeText(AnotherSignup.this, "Sucessfully registered", Toast.LENGTH_SHORT).show();


                name.setText("");
                phoneNumber.setText("");
                email.setText("");
                address.setText("");
                password.setText("");
                gender.clearCheck();


                UserModel userModel=new UserModel();
                userModel.setName(vName);
                userModel.setEmail(vEmail);
                userModel.setMobile(vPhoneNumber);
                userModel.setAddress(vAddress);
                userModel.setPassword(vPassword);
                userModel.setGender(vGender);
                users.add(userModel);


                try {
                    for (int i=0; i>users.size(); i++)
                    {
                        UserModel model= users.get(i);

                        Log.e("Name",""+model.getName());
                        Log.e("mobile",""+model.getMobile());
                        Log.e("Email",""+model.getEmail());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Log.e("User list count",""+users.size());


        }


        });

    }

}