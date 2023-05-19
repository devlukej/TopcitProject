package com.example.topcitproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class TopcitProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopcitProjectApplication.class, args);
	}

}
