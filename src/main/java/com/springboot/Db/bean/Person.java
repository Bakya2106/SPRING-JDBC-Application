package com.springboot.Db.bean;

import java.sql.Date;

import javax.persistence.Entity;

import org.springframework.core.annotation.Order;


public class Person {

	
	private int id;
	private String name;
	private String Location;
	private Date birthdate;

	public Person() {
		
	}
	public Person(int id, String name, String location, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		Location = location;
		this.birthdate = birthdate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	@Override
	public String toString() {
		return "\n Person [id=" + id + ", name=" + name + ", Location=" + Location + ", birthdate=" + birthdate + "]";
	}
	
	
}
