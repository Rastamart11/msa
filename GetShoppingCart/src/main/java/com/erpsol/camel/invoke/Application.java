package com.erpsol.camel.invoke;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication(scanBasePackages = "com.erpsol.camel.invoke")
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        CamelSpringBootApplicationController bean = run.getBean(CamelSpringBootApplicationController.class);
        bean.run();
    }
	
}