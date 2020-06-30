package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan("com.example")
@SpringBootApplication
public class SpringJdbcTemplateExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplateExampleApplication.class, args);
		System.out.println("Pushed to Git hub");
		System.out.println("Added another Change in the Application.java file");
	}
}
