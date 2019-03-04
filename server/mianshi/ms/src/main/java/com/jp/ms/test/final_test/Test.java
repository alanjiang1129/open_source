package com.jp.ms.test.final_test;

public class Test {
    public static void main(String[] args) {
        //final 常亮类
        Test1 test1 = new Test1();
        test1.name = "haha";
        test1.age = "18";
        test1.setPwd("1234");
        System.out.println(test1.name);
        System.out.println(test1.age);
        System.out.println(test1.getPwd());
        //final 常亮
        final String a ="1";
        System.out.println(a);

        // finally
        // try {
        //     String b = null;
        //     b.equals("asdf");
        // }catch (Exception e){
        //     e.printStackTrace();
        // }finally {
        //
        // }
    }
}
