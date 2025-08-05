package com.example.springlifecycle.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("serviceA")  // ServiceB só será criado após ServiceA
public class ServiceB {
    public ServiceB() {
        System.out.println("🟢 ServiceB instanciado.");
    }
}
