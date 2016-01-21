package com.tom.performancetesttools;

import android.widget.TextView;

/**
 * Created by tom on 2016/1/21.
 */
public class TestData {

    private static TestData  sInstance;
    private TextView textView;
    public static TestData getInstance(){
        if (sInstance==null){
            sInstance=new TestData();
        }
        return sInstance;
    }
    public void setTextViewText(TextView textView){
        textView=textView;
        textView.setText("000000000000000000 test");
    }


}
