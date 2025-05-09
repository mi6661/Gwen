package com.gulu.gwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GwenApplication {

    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(GwenApplication.class, args);
    }
}
