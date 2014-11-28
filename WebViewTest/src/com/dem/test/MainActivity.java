package com.dem.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	private WebView mWebView;
	private WebSettings mWebSettings;
	String mPostData = "";

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mWebView = new WebView(this);
		setContentView(mWebView);
		

		String _userName = "015611733173";
		String _psw = "3333333";
		mPostData = "data[User][cardid]=" + _userName
				+ "&data[User][password]=" + _psw;

		mWebSettings = mWebView.getSettings();
		mWebSettings.setJavaScriptEnabled(true);
		mWebSettings.setSavePassword(true);
		mWebSettings.setSaveFormData(false);
		mWebSettings.setBuiltInZoomControls(true);
		mWebSettings.setSupportZoom(true);
		mWebView.setWebViewClient(new WebViewClient());
		String str = "http://data2.contec365.com/wx_mobile";
		mWebView.loadUrl(str);

	}

}
