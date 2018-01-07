package kk.springframework.di.services;

public class HelloWorldServicePolish implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World in Polish";
    }
}
