package com.example.springlifecycle.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleService {

    @PostConstruct
    public void init() {
        System.out.println("🚀 LifecycleService iniciado (@PostConstruct)");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("🧹 LifecycleService será destruído (@PreDestroy)");
    }
}
