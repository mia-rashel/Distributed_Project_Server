package com.example.coen_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude =  SecurityAutoConfiguration.class )
public class CoenProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoenProjectApplication.class, args);
	}

}