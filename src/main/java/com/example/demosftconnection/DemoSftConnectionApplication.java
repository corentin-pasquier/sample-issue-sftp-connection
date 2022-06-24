package com.example.demosftconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring-integration/**/*.xml"})
public class DemoSftConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSftConnectionApplication.class, args);
	}

}
