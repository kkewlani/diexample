package kk.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import kk.springframework.di.services.HelloWorldService;
import kk.springframework.di.services.HelloWorldServiceFactory;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldServiceFactory helloWorldServiceFactory() {
        return new HelloWorldServiceFactory();
    }

    @Bean
    @Profile({ "default", "english" })
    public HelloWorldService helloWorldServiceEnglish(HelloWorldServiceFactory factory) {
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldServiceFactory factory) {
        return factory.createHelloWorldService("es");
    }
}
