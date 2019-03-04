package com.jp.ms.springboot.启动时接口调用并获取指定接口所有实现类;

import org.omg.CosNaming.NamingContextExtOperations;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

@Component
public class Runtime implements CommandLineRunner, ApplicationContextAware {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动前运行");
    }

    /**
     * 获取应用上下文并获取相应的接口实现类
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //根据接口类型返回相应的所有bean
        Map<String, Job> map = applicationContext.getBeansOfType(Job.class);
        map.get("job_A").console();
        map.get("job_B").console();
        System.out.println(map);
        //在这里load方法的返回值是一个迭代器，用这个迭代器可以遍历出所有的接口实现类
        ServiceLoader<Job> load = ServiceLoader.load(Job.class);
        Iterator<Job> iterator = load.iterator();
        while (iterator.hasNext()){
            Job next = iterator.next();
            System.out.println(next);
        }
    }
}
