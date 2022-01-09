package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.amazon.app.R;

public class FragmentActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    FrameLayout frameLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        frameLayout=findViewById(R.id.framelayout);
        btn1=findViewById(R.id.click1);
        btn2=findViewById(R.id.click2);
        btn3=findViewById(R.id.click3);

        loadFragmentfirst(new Firstfrag());
        loadfragWhilebuttonClicked(btn1,btn2,btn3);



    }

    private void loadfragWhilebuttonClicked(Button btn1, Button btn2, Button btn3) {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Firstfrag() ).commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Secondfrag() ).commit();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Thirdfrag() ).commit();
            }
        });

    }

    private boolean loadFragmentfirst(Firstfrag firstfrag) {
        if(firstfrag==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Firstfrag()).commit();
            return true;
        }
        return false;
    }


}
