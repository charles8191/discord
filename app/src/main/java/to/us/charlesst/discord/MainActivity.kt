package to.us.charlesst.discord

import android.os.Bundle
import android.webkit.CookieManager
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                val webView: WebView = findViewById(R.id.webview)
                CookieManager.getInstance().setAcceptCookie(true)
                val webSettings: WebSettings = webView.getSettings()
                webView.settings.javaScriptEnabled = true
                webView.webViewClient = WebViewClient()
                webView.settings.userAgentString = "Android/10.0 (compatible; Charles Discord webapp wrapper)"
                webView.settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                webSettings.setDomStorageEnabled(true)
                webView.loadUrl("https://discord.com/app")
    }
}