package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeComposeDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeComposeDockerApplication.class, args);
	}

}
