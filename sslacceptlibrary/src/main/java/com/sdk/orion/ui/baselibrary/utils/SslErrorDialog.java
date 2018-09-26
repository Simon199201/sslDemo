package com.sdk.orion.ui.baselibrary.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;


public class SslErrorDialog {
    public void showSslErrorDialog(Context activity, final SslErrorHandler mHandler){
        Log.d("SslErrorDialog", "强制处理");
        mHandler.proceed();
    }
}
