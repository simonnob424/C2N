package com.c2n.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext context = ApplicationContextProvider.getApplicationContext();
		C2NService service = context.getBean(C2NService.class);
		service.listEmployees();
	}
}
