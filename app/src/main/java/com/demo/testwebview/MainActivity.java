package com.demo.testwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = this.findViewById(R.id.webView);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.clearCache(true);


        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view,String url) {
                return false;
            }
        });

        webView.loadUrl("http://172.16.40.47/app/device/?loginBy=password#/");
        //webView.loadUrl("https://airlink.cc/");
        //webView.loadUrl("http://172.16.40.47/app/controlpad/?sn=50BC6E90-47A9-40B2-853E-8D08C25CE151#/");
    }
}