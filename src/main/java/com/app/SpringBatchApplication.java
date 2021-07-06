package com.app;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Directly we can run , it will run on embedded tomcat server
@EnableBatchProcessing

public class SpringBatchApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBatchApplication.class, args);
	}
}