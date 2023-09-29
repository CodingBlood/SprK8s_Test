package com.sprk1.sprk1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.sprk1.sprk1.db_utils.dbUtils.getConnected;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Sprk1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sprk1Application.class, args);
	}
}
