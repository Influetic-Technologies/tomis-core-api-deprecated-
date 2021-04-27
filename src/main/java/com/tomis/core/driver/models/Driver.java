package com.tomis.core.driver.models;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Table
@EntityListeners (AuditingEntityListener.class)
public class Driver {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String firstName;
	private String lastName;
	private String drivingLicense;
	
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedDate
	private Date modifiedDate;
	
	public Driver() {}
	
	public Driver(String firstName, String lastName, String drivingLicense) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.drivingLicense = drivingLicense;
	}
	
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String getDrivingLicense() {
		return drivingLicense;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	public Date getModifiedDate() {
		return modifiedDate;
	}
	
	@Override
	public String toString() {
		return "Driver [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	@PrePersist
    public void onPrePersist() { 
		System.out.println("Persiting: " + this.toString());
	}
}
