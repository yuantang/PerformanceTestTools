package com.tom.performancetesttools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        TextView textView= (TextView) findViewById(R.id.tv_test);
        TestData.getInstance().setTextViewText(textView);

        A a=new A();
        User user=new User();
        a.user=user;
        B.aa=a;

    }
}
