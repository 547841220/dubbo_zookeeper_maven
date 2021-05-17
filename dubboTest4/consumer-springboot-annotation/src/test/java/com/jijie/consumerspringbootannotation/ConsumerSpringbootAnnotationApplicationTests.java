package com.jijie.consumerspringbootannotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.jijie.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
@EnableDubbo
class ConsumerSpringbootAnnotationApplicationTests {

    @Reference
    private IUserService userService;
    @Test
    void contextLoads() throws IOException {
        for (int i = 0; i < 4; i++) {
            System.out.println(userService.hello());
        }

    }

}
