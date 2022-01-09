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
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.amazon.app.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText name, phoneNumber, email, age, address, password;
    RadioGroup gender;
    ScrollView scrollView;
    Button signUp;
    ToggleButton marriedstatus;
    List<String> city;
    List<String> state;
    List<String> country;
    Spinner spinnerCity, spinnerState, spinnerCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        name = (EditText) findViewById(R.id.person_name);
        phoneNumber = (EditText) findViewById(R.id.phone_number);
        email = (EditText) findViewById(R.id.email_id);
        age = (EditText) findViewById(R.id.age);
        address = (EditText) findViewById(R.id.address);
        password = (EditText) findViewById(R.id.password);
        signUp = (Button) findViewById(R.id.signup);

        gender = (RadioGroup) findViewById(R.id.gender);
        marriedstatus = (ToggleButton) findViewById(R.id.marriedstatus);


        spinnerCity = (Spinner) findViewById(R.id.city);
        spinnerState = (Spinner) findViewById(R.id.state);
        spinnerCountry = (Spinner) findViewById(R.id.country);

        city = new ArrayList<String>();
        city.add("Select your option");
        city.add("Madurai");
        city.add("Pudhukottai ");
        city.add("Dindukal");
        city.add("Trichy");
        city.add("Ariyalur");
        city.add("Selam");

        // Creating adapter for spinner
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, city);

        // Drop down layout style - list view with radio button
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerCity.setAdapter(cityAdapter);


        state = new ArrayList<String>();
        state.add("Select your option");
        state.add("TamilNadu");
        state.add("Kerala ");
        state.add("Bangalore");
        state.add("Gujarat");
        state.add("Delhi");
        state.add("AndraPradesh");

        // Creating adapter for spinner
        ArrayAdapter<String> stateAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, city);

        // Drop down layout style - list view with radio button
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerState.setAdapter(stateAdapter);


        country = new ArrayList<String>();
        country.add("Select your option");
        country.add("India");
        country.add("Japan ");
        country.add("China");
        country.add("SriLanka");
        country.add("pakisthan");
        country.add("Bangladesh");

        // Creating adapter for spinner
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, city);

        // Drop down layout style - list view with radio button
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerCountry.setAdapter(countryAdapter);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String vName, vPhoneNumber, vEmail, vAge, vAddress, vPassword, vGender , vCity, vState, vCountry, vMarriedstatus;
                vName = name.getText().toString();
                vPhoneNumber = phoneNumber.getText().toString();
                vEmail = email.getText().toString();
                vAge = age.getText().toString();
                vAddress = address.getText().toString();
                vPassword = password.getText().toString();
                vCity = spinnerCity.getSelectedItem().toString();
                vState = spinnerState.getSelectedItem().toString();
                vCountry = spinnerCountry.getSelectedItem().toString();
                vMarriedstatus = marriedstatus.getText().toString();



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
                }if (TextUtils.isEmpty(vAge)) {
                    age.setError("Enter your Age");
                    return;
                }




                //if (vGender.equals("Male")) {
                //    Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                // } else {
               // Toast.makeText(MainActivity.this, vGender, Toast.LENGTH_SHORT).show();
                //}

                if (vCity.equals("Select your city")) {

                    Toast.makeText(MainActivity.this, "Please Select Your City", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (vState.equals("Select your state")) {
                    Toast.makeText(MainActivity.this, "Please Select Your State", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (vCountry.equals("Select your country")) {

                    Toast.makeText(MainActivity.this, "Please Select Your Country", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gender.getCheckedRadioButtonId() != -1) {
                    int selectedId = gender.getCheckedRadioButtonId();
                    RadioButton radioButton = (RadioButton) findViewById(selectedId);
                    vGender = radioButton.getText().toString();
                } else {
                    Toast.makeText(MainActivity.this, "Please select your Gender", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (vMarriedstatus.equalsIgnoreCase("on")) {
                    Log.e("Married Status :", "Married");
                    Toast.makeText(MainActivity.this, "Married", Toast.LENGTH_SHORT).show();

                } else {
                    Log.e("Married Status :", "UnMarried");
                    Toast.makeText(MainActivity.this, "UnMaried ", Toast.LENGTH_SHORT).show();
                }

                Toast.makeText(MainActivity.this, "Sucessfully registered", Toast.LENGTH_SHORT).show();
            }
        });


    }

}