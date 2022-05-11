package com.webdev.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DrawingApp {

	public static void main(String[] args) {

		SpringApplication.run(DrawingApp.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Triangle triangle = context.getBean(Triangle.class);

		triangle.draw();

		((ClassPathXmlApplicationContext) context).close();

	}

}
