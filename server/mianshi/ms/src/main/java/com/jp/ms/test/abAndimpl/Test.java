package com.jp.ms.test.abAndimpl;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args)throws Exception {
        Class clazz = Test1.class;
        Method[] methods = clazz.getMethods();
        clazz.getMethod("getAge");
        clazz.getDeclaredMethod("test1");
    }
}
