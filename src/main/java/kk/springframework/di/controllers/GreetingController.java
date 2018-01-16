package kk.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import kk.springframework.di.services.HelloWorldService;

@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceGerman;
    private HelloWorldService helloWorldServiceFrench;

    @Autowired // injected by bean type
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Autowired
    @Qualifier("helloWorldServiceGerman") // injected by method name
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    @Autowired
    @Qualifier("french") // injected by custom name
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public String sayHello() {
        String greeting = helloWorldService.getGreeting();
        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());
        System.out.println(helloWorldServiceFrench.getGreeting());
        return greeting;
    }
}
