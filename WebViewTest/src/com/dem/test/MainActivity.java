package com.dem.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * 
 * 
 * 项目名称：WebViewTest 类名称：MainActivity 类描述： 创建人：Le 创建时间：2014年11月28日 下午2:34:51
 * 修改人：Le 修改时间：2014年11月28日 下午2:34:51 修改备注：
 * 
 * @version
 *
 */
public class MainActivity extends Activity {
    private WebView mWebView;

    private WebSettings mWebSettings;

    String mPostData = "";

    // ����github��

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mWebView = new WebView(this);
        setContentView(mWebView);

        String _userName = "015611733173";
        String _psw = "3333333";
        mPostData = "data[User][cardid]=" + _userName + "&data[User][password]=" + _psw;

        mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
        mWebSettings.setSavePassword(true);
        mWebSettings.setSaveFormData(false);
        mWebSettings.setBuiltInZoomControls(true);
        mWebSettings.setSupportZoom(true);
        mWebView.setWebViewClient(new WebViewClient());
        String str = "http://data2.contec365.com/wx_mobile";
        mWebView.loadUrl(str);
        System.out.println(" ����appp 1548");
    }
    public static String getName(){
        
        return "zkq upload  name 1548";
    }

}
