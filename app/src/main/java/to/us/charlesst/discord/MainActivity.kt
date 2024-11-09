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
                webView.settings.userAgentString = "Android (+https://github.com/charles8191/discord)" // prevent fingerprinting by user-agent
                webSettings.setDomStorageEnabled(true) // used for tokens
                webSettings.mediaPlaybackRequiresUserGesture = false; // fix loading animation
                webView.loadUrl("https://discord.com/app")
    }

    override fun onBackPressed() { // fix back button
        val webView: WebView = findViewById(R.id.webview)
        webView.goBack()
    }
}
