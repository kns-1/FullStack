package com.example.springbootwebapplication;

import com.example.springbootwebapplication.controller.JspController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = JspController.class)
public class SpringbootWebapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebapplicationApplication.class, args);
	}

}
