package com.example.demospringbootyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringbootYtApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoSpringbootYtApplication.class, args);
		
		//Initialization of spring container
		ConfigurableApplicationContext contextObj = SpringApplication.run(DemoSpringbootYtApplication.class, args);
		
		System.out.println("Welcome to Springboot blah!");

		//Create object by using the existing Spring bean (bean is created when the class is instantiated)
		MyFirstClass objMyFirstClass1 = contextObj.getBean(MyFirstClass.class);
		//getBean() creates a bean of type MyFirstClass

		objMyFirstClass1.show();

		// MyFirstClass objMyFirstClass2 = contextObj.getBean(MyFirstClass.class);
		// objMyFirstClass2.show();
	}

}
