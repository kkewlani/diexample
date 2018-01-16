package kk.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
    @Primary
    public HelloWorldService helloWorldServiceEnglish(HelloWorldServiceFactory factory) {
        return factory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceSpanish(HelloWorldServiceFactory factory) {
        return factory.createHelloWorldService("es");
    }

    @Bean("french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldServiceFactory factory) {
        return factory.createHelloWorldService("fr");
    }

    @Bean
    public HelloWorldService helloWorldServiceGerman(HelloWorldServiceFactory factory) {
        return factory.createHelloWorldService("de");
    }

    @Bean
    public HelloWorldService helloWorldServicePolish(HelloWorldServiceFactory factory) {
        return factory.createHelloWorldService("pl");
    }

    @Bean
    public HelloWorldService helloWorldServiceRussian(HelloWorldServiceFactory factory) {
        return factory.createHelloWorldService("ru");
    }
}
