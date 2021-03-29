package com.spring.swagger.demoswagger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressBookResource {
	//vishal patidar
	HashMap<String,Contact> contacts=new HashMap<>();
	
	@GetMapping("/{id}")
	public Contact getContact(@PathVariable String id)
	{
		return contacts.get(id);
	}
	@GetMapping("/")
	public List<Contact> getAllContact(){
		return new ArrayList<>(contacts.values());
	}
	@PostMapping("/")
	public Contact addContact(@RequestBody Contact contact)
	{
		System.out.println("sambhav");
		contacts.put(contact.getId(), contact);
		return contact;
	}
}
