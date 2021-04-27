package com.tomis.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TomisApiCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TomisApiCoreApplication.class, args);
	}

}
