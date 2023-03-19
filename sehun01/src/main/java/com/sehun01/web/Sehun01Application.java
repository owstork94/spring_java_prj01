package com.sehun01.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Sehun01Application {

	public static void main(String[] args) {
		SpringApplication.run(Sehun01Application.class, args);
	}

}
