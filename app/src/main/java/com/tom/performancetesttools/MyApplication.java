package com.tom.performancetesttools;

import android.app.Application;
import android.content.Context;

import com.github.moduth.blockcanary.BlockCanary;

/**
 * Created by tom on 2016/1/21.
 */
public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;
//        LeakCanary.install(this);
        BlockCanary.install(this, new AppBlockCanaryContext()).start();
    }
    public static Context getAppContext() {
        return mContext;
    }
}
