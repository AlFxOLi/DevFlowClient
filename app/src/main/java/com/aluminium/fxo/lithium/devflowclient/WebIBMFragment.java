package com.aluminium.fxo.lithium.devflowclient;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

//фрагмент, подгружающий статью курса из сети

public class WebIBMFragment extends Fragment {

    private WebView webview;

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1: {
                    webViewGoBack();
                }
                break;
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_ibm, container, false);

        webview = (WebView) view.findViewById(R.id.ibmwebView);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://ru.wikipedia.org/wiki/IBM_PC");

        webview.setOnKeyListener(new View.OnKeyListener() {

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK
                        && event.getAction() == MotionEvent.ACTION_UP
                        && webview.canGoBack()) {
                    handler.sendEmptyMessage(1);
                    return true;
                }

                return false;
            }

        });

        return view;
    }

    private void webViewGoBack() {
        webview.goBack();
    }
}