package com.tcs.phonebook.service;

import java.util.List;

import com.tcs.phonebook.entity.Contact;

public interface ContactService {
	
	public String savecontact(Contact contact);
	public List<Contact>getAllContacts();
	public Contact getContactById(Integer contactId);
	public String updateContact(Contact contact);
	public String deleteContact(Integer contact);

}
