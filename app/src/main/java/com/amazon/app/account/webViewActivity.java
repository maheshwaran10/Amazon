package com.amazon.app.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amazon.app.R;

public class webViewActivity extends AppCompatActivity {
   public WebView w1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        w1 = (WebView) findViewById(R.id.Web);
        w1.setWebViewClient(new WebViewClient());
        w1.loadUrl("https://www.google.com/");
    }

    @Override
    public void onBackPressed() {
        if(w1.canGoBack())
        {
            w1.goBack();
        }
        else {
            super.onBackPressed();
        }

    }
}


