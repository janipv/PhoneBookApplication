package com.tcs.phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.phonebook.entity.Contact;
import com.tcs.phonebook.service.ContactService;


@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/contact")
	public String savecontact(@RequestBody Contact contact) {
		String Data=contactService.savecontact(contact);
		return Data;
	}
	@GetMapping("/contacts")
	public List<Contact>getAllContacts(){
		return contactService.getAllContacts();
	}
	@GetMapping("/contact/{contactId}")
	public Contact getContactById(@PathVariable Integer contactId) {
		return contactService.getContactById(contactId);
	}
	@PutMapping("/update")
	public String updateContact(@RequestBody Contact contact) {
		return contactService.updateContact(contact);
	}
	@DeleteMapping("/contact/{contactId}")
	public String deleteContact(@PathVariable Integer contact) {
		return contactService.deleteContact(contact);
	}

}






