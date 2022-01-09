package com.amazon.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {

    private EditText number,msg;
    private Button sendMessage;

    private PendingIntent sendPendingIntent;
    private PendingIntent receivePendingIntent;
    private String SENT_ACTION = "SMS_SENT_ACTION";
    private String DELIVERED_ACTION = "SMS_DELIVERED_ACTION";

    private static final int SMS_REQUEST_PERMISSION_CODE=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        number = findViewById(R.id.et_phone);
        msg = findViewById(R.id.et_message);
        sendMessage = findViewById(R.id.bt_send);

        sendPendingIntent = PendingIntent.getBroadcast(this,0,new Intent(SENT_ACTION),0);

        receivePendingIntent = PendingIntent.getBroadcast(this,0,new Intent(DELIVERED_ACTION),0);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(SmsActivity.this,"SMS Sent",Toast.LENGTH_SHORT).show();
            }
        },new IntentFilter(SENT_ACTION));


        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(SmsActivity.this,"SMS Delivered",Toast.LENGTH_SHORT).show();
            }
        },new IntentFilter(DELIVERED_ACTION));

        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no = number.getText().toString();
                String msgText=msg.getText().toString();
                if (ContextCompat.checkSelfPermission(SmsActivity.this, Manifest.permission.SEND_SMS)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(SmsActivity.this,new String[]
                                    {Manifest.permission.SEND_SMS},SMS_REQUEST_PERMISSION_CODE
                            );
                }else{
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(no,null,msgText,sendPendingIntent,receivePendingIntent);
                    //Toast.makeText(SmsActivity.this, "Message Sent", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==SMS_REQUEST_PERMISSION_CODE){
            if (grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {

            }else{
                Toast.makeText(SmsActivity.this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}