package com.hello.beans;

public class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}
	
	
	public User() {
		super();
		this.name = "noname";
	}
	
	
}
