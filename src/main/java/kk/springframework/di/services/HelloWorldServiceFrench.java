package kk.springframework.di.services;

public class HelloWorldServiceFrench implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World in French";
    }
}
