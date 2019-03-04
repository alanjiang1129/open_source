package com.jp.ms.springboot.启动时接口调用并获取指定接口所有实现类;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Job_A implements Job {
    @Override
    public void console() {
        System.out.println("Job_A");
    }
}
