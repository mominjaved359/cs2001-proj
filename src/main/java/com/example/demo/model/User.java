package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int id;
	
	private String name;
	private String classname;
	
	
	
	
	
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





	public String getClassname() {
		return classname;
	}





	public void setClassname(String classname) {
		this.classname = classname;
	}





	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", classname=" + classname + "]";
	}
	
	
	

}
