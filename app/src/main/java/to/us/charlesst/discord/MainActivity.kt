package to.us.charlesst.discord

import android.os.Bundle
import android.webkit.CookieManager
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
                window.statusBarColor = ContextCompat.getColor(this, R.color.blurple)
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                val webView: WebView = findViewById(R.id.webview)
                CookieManager.getInstance().setAcceptCookie(true) // for Cloudflare
                val webSettings: WebSettings = webView.getSettings()
                webView.settings.javaScriptEnabled = true // for obvious reasons, Discord is a JS-heavy app
                webView.webViewClient = WebViewClient()
                webView.settings.userAgentString = "Android" // prevent fingerprinting by user-agent
                webSettings.setDomStorageEnabled(true) // used for tokens
                webView.loadUrl("https://discord.com/app")
    }
}
