package com.example.wronglogframe;

import android.app.Application;

import com.dreamlive.cn.clog.CollectLog;

/**
 * Created by Administrator on 2016/12/2.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CollectLog clog = CollectLog.getInstance();
        clog.init(this);
    }
}
