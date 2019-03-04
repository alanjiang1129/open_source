package com.jp.ms.test.abAndimpl;

public class Test1 extends TestAb1 {
    private int age;

    @Override
    protected void test1() {
        System.out.println("z test1");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
