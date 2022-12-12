package com.tcs.phonebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.phonebook.entity.Contact;
import com.tcs.phonebook.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
	ContactRepository repo;
	private Integer contactId;
    
	@Override
	public String savecontact(Contact contact) {
		repo.save(contact);
		if (contact.getContactId() != null) {
		
		return "contact saved";	
	}
		else {
			return "not saved";
		}
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return repo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact>findById=repo.findById(contactId);
		if(findById.isPresent())
			return findById.get();
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		if(repo.existsById(contact.getContactId())) {
			repo.save(contact).getContactId();
			return "contact updated";
		}else {
			
		
		return null;
	}
	}

	@Override
	public String deleteContact(Integer contact) {
		if(repo.existsById(contactId)) {
			repo.deleteById(contactId);
			return"contact deleted";
		}else {
		return null;
	}
	}
}
