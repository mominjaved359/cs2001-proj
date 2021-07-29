package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	public int id;
	
	public String name;
	public String classname;
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", classname=" + classname + "]";
	}
	
	
	

}
