package com.jijie.consumerspringbootxml;

import com.alibaba.dubbo.config.annotation.Reference;

import com.jijie.service.IUserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
class ConsumerSpringbootXmlApplicationTests {

    @Resource
    private IUserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.hello());
    }

}
