package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.amazon.app.R;

public class RatingBarActivity extends AppCompatActivity {
    RatingBar r1;
    EditText e1;
    Button  b1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        r1=findViewById(R.id.movieRating);
        e1=findViewById(R.id.movieName);
        b1=findViewById(R.id.movieSubmit);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String movie=e1.getText().toString();
                if(!TextUtils.isEmpty(movie)){
                  float value=r1.getRating();
                 if(value>0 && value<2.5)
                 {
                     t1.setText("Bad");
                 }
                  else if(value>2.0 && value<3.5)
                    {
                        t1.setText("moderate");
                    }
                 else
                    {
                        t1.setText("good");
                    }

                 if(value>0)
                  {
                      String result="Movie :"+movie+"\nRatting:"+value;
                      Toast.makeText(RatingBarActivity.this, result+"Star", Toast.LENGTH_SHORT).show();
                  }else
                  {
                      Toast.makeText(RatingBarActivity.this, "Please Enter Your Rating", Toast.LENGTH_LONG).show();
                  }

                  //r1.setNumStars(7);
                    //r1.stepSize(1);
                    //r1.stepRating(4)
                }
                else {
                    Toast.makeText(RatingBarActivity.this, "Enter Movie Name", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}