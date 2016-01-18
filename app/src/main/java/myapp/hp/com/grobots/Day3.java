package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


public class Day3 extends Activity {

    WebView web;
    ProgressBar pb;
    ConnectivityManager cManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);
        web = (WebView) findViewById(R.id.Day3WebView);
        pb = (ProgressBar) findViewById(R.id.Day3ProgressBar);

        cManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
        if (nInfo == null) {
            Intent intent = new Intent(Day3.this, ErrorActivity4.class);
            startActivity(intent);
            finish();
        }


        web.getSettings().setJavaScriptEnabled(true);
        web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        web.getSettings().enableSmoothTransition();
        web.loadUrl("https://docs.google.com/document/d/1O0SS4hf7EeUc0qbUVkN4MbicdEY2azs1KOCNLqYAmwQ/pub");
        web.setWebViewClient(new mywebClient());

    }

    public class mywebClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            pb.setVisibility(View.GONE);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
            web.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}


