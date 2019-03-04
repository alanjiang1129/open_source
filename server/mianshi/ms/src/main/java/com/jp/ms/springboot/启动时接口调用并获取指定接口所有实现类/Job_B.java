package com.jp.ms.springboot.启动时接口调用并获取指定接口所有实现类;

import org.springframework.stereotype.Component;

@Component
public class Job_B implements Job {
    @Override
    public void console() {
        System.out.println("Job_B");
    }
}
