package kk.springframework.di.services;

public class HelloWorldServiceRussian implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World in Russian";
    }
}
