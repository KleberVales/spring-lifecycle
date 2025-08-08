package com.example.springlifecycle.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycle {

    @PostConstruct
    public void init(){
        System.out.println("BeanLifeCycle init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("BeanLifeCycle destroy");
    }
}
