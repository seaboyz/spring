package com.webdev.springrestapi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class DrawingApp {

	public static void main(String[] args) {

		SpringApplication.run(DrawingApp.class, args);

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("spring.xml");

		// Triangle triangle = context.getBean(Triangle.class);

		// triangle.draw();

		// ((ClassPathXmlApplicationContext) context).close();

		// bean factory
		Resource resource = new ClassPathResource("spring.xml");

		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Employee employee = beanFactory.getBean(Employee.class);

		System.out.println(employee.getName());
		System.out.println(employee.getEmail());

	}

}
