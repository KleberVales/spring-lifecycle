package com.example.springlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLifecycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLifecycleApplication.class, args);
        System.out.println("📦 Aplicação iniciada.");
    }
}
