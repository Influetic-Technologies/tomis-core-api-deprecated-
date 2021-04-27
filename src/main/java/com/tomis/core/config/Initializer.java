package com.tomis.core.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Initializer {
	
	@Bean
	public CommandLineRunner print() {
		return args -> {
			System.out.println("Initializing application");
		};
	}

}
