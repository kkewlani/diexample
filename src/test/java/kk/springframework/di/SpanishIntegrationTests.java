package kk.springframework.di;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kk.springframework.di.services.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = { "classpath:/spring/helloworld-config.xml", "classpath*:/spring/spanish-hello-world.xml" })
public class SpanishIntegrationTests {

    @Autowired
    HelloWorldService helloWorldService;

    @Test
    public void testHelloWorld() {
        String greeting = helloWorldService.getGreeting();

        assertEquals("Hola mundo!", greeting);
    }
}
