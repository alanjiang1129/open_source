package com.jp.ms.test.abAndimpl;

public abstract class TestAb1 {
    protected String name;
    protected String age;

    protected abstract void test1();
    protected void test2() {
        System.out.println("ab test2");
    }
}
