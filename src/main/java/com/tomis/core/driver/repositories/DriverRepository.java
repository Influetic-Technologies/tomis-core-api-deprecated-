package com.tomis.core.driver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tomis.core.driver.models.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {}
