package com.spring.swagger.demoswagger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

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
	public void abcd()
	{
	System.out.println("Test");
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getPhone() {
		
		return phone;
	}
	public void setPhone(String phone) {
		
		this.phone = phone;
	}
	
}
