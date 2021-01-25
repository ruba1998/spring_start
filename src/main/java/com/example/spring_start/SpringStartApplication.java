package com.example.spring_start;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStartApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringStartApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringStartApplication.class, args);
    }



}
