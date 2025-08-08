package com.example.springlifecycle.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@DependsOn("serviceA")
public class ServiceB {

    public ServiceB(){
        System.out.println("ServiceB");
    }
}
