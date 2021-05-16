package com.jijie.consumer;

import com.jijie.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-consumer.xml"});
        context.start();
        //获取远程服务
        IUserService userService = context.getBean(IUserService.class);

        System.out.println("获取服务端的反馈信息："+userService.hello());

        System.in.read();

    }
}
