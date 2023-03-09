package com.luv2code.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	// fields
	
	private String name;
	
	private String level;

	// Getters and Setters
	
	public String getName() {
		System.out.println("class com.luv2code.aopdemo.dao.Account: GETTING ACCOUNT NAME");
		return name;
	}

	public void setName(String name) {
		System.out.println("class com.luv2code.aopdemo.dao.Account: SETTING ACCOUNT NAME");
		this.name = name;
	}

	public String getLevel() {
		System.out.println("class com.luv2code.aopdemo.dao.Account: GETTING ACCOUNT LEVEL");
		return level;
	}

	public void setLevel(String level) {
		System.out.println("class com.luv2code.aopdemo.dao.Account: SETTING ACCOUNT LEVEL");
		this.level = level;
	}
	
	
	
}
