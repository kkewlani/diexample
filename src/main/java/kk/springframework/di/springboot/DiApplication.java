package kk.springframework.di.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import kk.springframework.di.controllers.GreetingController;

@SpringBootApplication
@ComponentScan("kk.springframework")
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}
}
