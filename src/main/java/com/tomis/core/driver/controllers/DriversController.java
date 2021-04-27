package com.tomis.core.driver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tomis.core.driver.models.Driver;
import com.tomis.core.driver.repositories.DriverRepository;

@RestController
public class DriversController {
	
	@Autowired
	private DriverRepository driverRepository;
	
	@GetMapping("/drivers")
	List<Driver> drivers() {
		List<Driver> list = (List<Driver>) this.driverRepository.findAll();
		return list;
	}
	
	
	@PostMapping("/drivers")
	Driver post(@RequestBody Driver driver) {
		System.out.println(driver);
		return this.driverRepository.save(driver);
	}
	

}
