package kk.springframework.di.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

    // All the beans have been moved to spring-config xml file
/*

    @Bean
    public HelloWorldServiceFactory helloWorldServiceFactory() {
        return new HelloWorldServiceFactory();
    }
*/

    /*@Bean
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
    }*/

    /*@Bean("french")
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
    }*/
}
