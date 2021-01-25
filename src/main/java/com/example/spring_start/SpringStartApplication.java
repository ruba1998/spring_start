package com.example.spring_start;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStartApplication.class, args);
        System.out.println("Welcome to the first project");
    }



}
