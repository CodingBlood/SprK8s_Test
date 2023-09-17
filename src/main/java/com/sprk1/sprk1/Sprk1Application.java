package com.sprk1.sprk1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Sprk1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sprk1Application.class, args);
	}
}
