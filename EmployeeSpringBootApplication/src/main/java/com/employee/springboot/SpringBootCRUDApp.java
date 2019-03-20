package com.employee.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.employee.springboot.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.employee.springboot"})
public class SpringBootCRUDApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
}
