package com.dbi.shyam.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EntityScan(basePackages = "com.dbi.shyam.model")
@EnableJpaRepositories(basePackages = "com.dbi.shyam.dao")
@ComponentScan(basePackages = "com.dbi.shyam")
@SpringBootApplication
public class EmployeeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMicroserviceApplication.class, args);
	}

}
