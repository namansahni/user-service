package com.naman.oj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class OjApplication {

    public static void main(String[] args) {
        SpringApplication.run(OjApplication.class, args);
    }

}
