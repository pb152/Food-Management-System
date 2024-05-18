package com.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FoodPandaProjectApplication extends SpringBootServletInitializer{
    
	public static void main(String[] args) {
		SpringApplication.run(FoodPandaProjectApplication.class, args);
	}

}
