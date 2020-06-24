package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectorController {

    private final GreetingService greetingService;

    public ConstructorInjectorController( GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}



