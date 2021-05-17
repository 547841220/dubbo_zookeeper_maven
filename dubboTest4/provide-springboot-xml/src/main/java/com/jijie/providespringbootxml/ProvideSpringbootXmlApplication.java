package com.jijie.providespringbootxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-provider.xml")
public class ProvideSpringbootXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideSpringbootXmlApplication.class, args);
    }

}
