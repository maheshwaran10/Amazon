package com.amazon.app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private  static  final String  MES="MyMessage";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_login);
        Log.i(MES,"onCreate Method ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MES,"onCreate Method ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MES,"onCreate Method ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MES,"onStart Method ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MES,"onStop Method ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MES,"onRestart Method ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MES,"onDestroy Method ");
    }
}