package com.example.javalab2oop_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class JavaLab2OopWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaLab2OopWebApplication.class, args);
    }
}
