package com.example.postgresrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class PostgresRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresRestApplication.class, args);
	}

}
