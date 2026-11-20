package com.atlas.marketintelligence;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebView; import android.webkit.WebSettings;
public class MainActivity extends Activity { @Override public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState); WebView w=new WebView(this); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); w.setBackgroundColor(0xff0b0f12); w.loadUrl("file:///android_asset/index.html"); setContentView(w); } }
