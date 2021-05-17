package com.jijie.consumerspringbootxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
public class ConsumerSpringbootXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringbootXmlApplication.class, args);
    }

}
