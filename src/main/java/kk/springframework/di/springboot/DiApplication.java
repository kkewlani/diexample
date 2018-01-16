package kk.springframework.di.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import kk.springframework.di.controllers.GreetingController;

@SpringBootApplication
//@ComponentScan("kk.springframework")
@ImportResource("classpath:/spring/spring-config.xml") // telling spring boot to import the configuration form the
// spring config xml file and in there we are asking to scan the components form the java file inside the pkg specified
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		controller.sayHello();
	}
}
