package kk.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import kk.springframework.di.services.HelloWorldService;
import kk.springframework.di.services.HelloWorldServiceEnglishImpl;
import kk.springframework.di.services.HelloWorldServiceSpanishImpl;

@Configuration
public class HelloConfig {

    @Bean
    @Profile({ "default", "english" })
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish() {
        return new HelloWorldServiceSpanishImpl();
    }
}
