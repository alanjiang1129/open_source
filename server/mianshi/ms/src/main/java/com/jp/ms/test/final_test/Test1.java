package com.jp.ms.test.final_test;

public final class Test1 {
    public String name;
    public static String age;
    private String pwd;

    public final String getPwd() {
        return pwd;
    }

    public final void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("asdfasdf");
        super.finalize();
    }
}
