package kk.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kk.springframework.di.services.HelloWorldService;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    @Autowired
    public GreetingController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        return greeting;
    }
}
