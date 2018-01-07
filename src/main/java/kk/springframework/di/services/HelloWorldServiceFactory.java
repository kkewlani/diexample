package kk.springframework.di.services;

public class HelloWorldServiceFactory {
    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService service = new HelloWorldServiceEnglishImpl();

        switch (language) {
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrench();
                break;
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case "pl":
                service = new HelloWorldServicePolish();
                break;
            case "ru":
                service = new HelloWorldServiceRussian();
                break;
            default:

        }
        return service;
    }
}
