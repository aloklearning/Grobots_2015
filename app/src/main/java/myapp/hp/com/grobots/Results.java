package myapp.hp.com.grobots;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


public class Results extends Activity {

    WebView web;
    ProgressBar pb;
    ConnectivityManager cManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        web = (WebView) findViewById(R.id.ResultWebView);
        pb = (ProgressBar) findViewById(R.id.ResultProgressBar);

        cManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
        if (nInfo == null) {
            Intent intent = new Intent(Results.this, ErrorActivity.class);
            startActivity(intent);
            finish();
        }


        web.getSettings().setJavaScriptEnabled(true);
        web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        web.getSettings().enableSmoothTransition();
        web.loadUrl("https://docs.google.com/document/d/1kQpXTh2dfb4FMohm5Za-zwLRyKNz49wohMf9hMlHb5U/pub");
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


}
