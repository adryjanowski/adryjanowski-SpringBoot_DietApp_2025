package com.adryjanowski.SpringBoot_DietApp_2025.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "Hello from HelloService!";
    }

}
