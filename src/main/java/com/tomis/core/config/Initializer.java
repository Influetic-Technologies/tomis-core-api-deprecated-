package com.tomis.core.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tomis.core.driver.models.Driver;
import com.tomis.core.driver.repositories.DriverRepository;

@Configuration
public class Initializer {
	@Bean
	public CommandLineRunner init(DriverRepository driverRepository) {
		return args -> {
			driverRepository.save(new Driver("Bwighane", "Mwalwanda"));
		};
	}

}
