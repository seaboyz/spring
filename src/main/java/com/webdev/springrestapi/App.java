package com.webdev.springrestapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		// SpringApplication.run(DrawingApp.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// employee
		// Employee employee = context.getBean("employee", Employee.class);

		// System.out.println(employee.getName());
		// System.out.println(employee.getEmail());

		// triangle

		Triangle triangle = context.getBean("triangle", Triangle.class);

		triangle.draw();

		((ClassPathXmlApplicationContext) context).close();

	}

}
