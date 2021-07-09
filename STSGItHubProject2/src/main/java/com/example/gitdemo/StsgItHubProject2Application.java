package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StsgItHubProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(StsgItHubProject2Application.class, args);
	}
	
	public void myFirstMethod() {
		System.out.println("This my First Method");
	}

}
