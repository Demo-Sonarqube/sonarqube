package com.spring.swagger.demoswagger;

import org.springframework.stereotype.Component;

//default import

@Component
public class Contact {
	
	private String id;
	private String name;
	private String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		System.out.println("TEST2");
		return phone;
	}
	public void setPhone(String phone) {
		
		this.phone = phone;
	}
}
