package com.tom.performancetesttools;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.github.moduth.blockcanary.BlockCanaryContext;

import java.io.File;

/**
 * Created by tom on 2016/1/21.
 */
public class AppBlockCanaryContext extends BlockCanaryContext {

    private static final String TAG = "AppBlockCanaryContext";

    /**
     * 标示符，可以唯一标示该安装版本号，如版本+渠道名+编译平台
     *
     * @return apk唯一标示符
     */
    @Override
    public String getQualifier() {
        String qualifier = "";
        try {
            Log.d(TAG,MyApplication.getAppContext().getPackageName());
            PackageInfo info = MyApplication.getAppContext().getPackageManager()
                    .getPackageInfo(MyApplication.getAppContext().getPackageName(), 0);
            qualifier += info.versionCode + "_" + info.versionName + "_YYB";
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "getQualifier exception", e);
        }
        return qualifier;
    }

    @Override
    public String getUid() {
        return "87224330";
    }

    @Override
    public String getNetworkType() {
        return "3G";
    }

    @Override
    public int getConfigDuration() {
        return 9999;
    }

    @Override
    public int getConfigBlockThreshold() {
        return 500;
    }

    @Override
    public boolean isNeedDisplay() {
        return Config.isDebug;
    }

    @Override
    public String getLogPath() {
        return "/blockcanary/performance";
    }

    @Override
    public boolean zipLogFile(File[] src, File dest) {
        return false;
    }

    @Override
    public void uploadLogFile(File zippedFile) {

    }
}
