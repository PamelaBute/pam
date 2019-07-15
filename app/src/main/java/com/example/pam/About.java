package com.example.pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class About extends AppCompatActivity {
    private Button mainPage;
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webView = (WebView) findViewById(R.id.info);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError (WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }

        });

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://andela.com/alc");
        //webView.loadUrl("https://www.wartcomgp.com");


        mainPage = findViewById(R.id.back);
        mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainPage();
            }
        });
    }

    public void mainPage(){
        Intent mainPageIntent = new Intent(this, MainActivity.class);
        startActivity(mainPageIntent);
    }
}
