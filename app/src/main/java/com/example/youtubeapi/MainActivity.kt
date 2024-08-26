package com.example.youtubeapi

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val webView1 = findViewById<WebView>(R.id.webView1)
        setupWebView(webView1,"https://www.youtube.com/watch?v=2qxBND1wIl4")

        val webView2 = findViewById<WebView>(R.id.webView2)
        setupWebView(webView2,"https://www.youtube.com/watch?v=B7IBapaRREk")


    }

  private  fun setupWebView(webView: WebView,videoUrl:String){
        val webSetting:WebSettings = webView.settings
        webSetting.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        webView.loadUrl(videoUrl)
    }
}