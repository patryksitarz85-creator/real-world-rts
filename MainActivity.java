package com.example.realworldrts;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebView; import android.webkit.WebSettings;
public class MainActivity extends Activity {
 public void onCreate(Bundle b){super.onCreate(b);setContentView(R.layout.activity_main);WebView w=findViewById(R.id.gameView);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);w.loadUrl("file:///android_asset/game.html");}
}
