package com.emine.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.emine"})
@EnableJpaRepositories(basePackages = {"com.emine"})
@ComponentScan(basePackages = {"com.emine"})
@SpringBootApplication

public class ExceptionManagementStarter {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagementStarter.class, args);
	}

}
