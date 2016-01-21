package com.tom.performancetesttools;

/**
 * Created by tom on 2016/1/21.
 */
public class User {

}
class A{
    User user;
}
class B{
    // 静态变量，将不会被回收，除非加载 B 类的 ClassLoader 被回收。
    static A aa;
}