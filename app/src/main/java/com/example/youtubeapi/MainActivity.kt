package com.example.youtubeapi

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebSettings
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val webView1 = findViewById<WebView>(R.id.webView1)



    }
}