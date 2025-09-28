package com.adryjanowski.SpringBoot_DietApp_2025.service;


import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
@Component
public class EndpointLogger implements ApplicationListener<ApplicationReadyEvent> {
    private final RequestMappingHandlerMapping handlerMapping;
    public EndpointLogger(RequestMappingHandlerMapping handlerMapping) {
        this.handlerMapping = handlerMapping;
    }
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        handlerMapping.getHandlerMethods().forEach((mapping, method) -> {
            System.out.println(mapping + " -> " + method);
        });
    }
}


