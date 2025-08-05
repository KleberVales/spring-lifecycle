package com.example.springlifecycle.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    public ServiceA() {
        System.out.println("🔵 ServiceA instanciado.");
    }
}
