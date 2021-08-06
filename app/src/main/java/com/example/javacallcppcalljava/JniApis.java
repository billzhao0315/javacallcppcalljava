package com.example.javacallcppcalljava;

public class JniApis {
    static {
        System.loadLibrary("native-lib");
    }
    public native String stringFromJNI();

    public native int jni2CPP(int msg);//JNI层调用CPP函数
}
