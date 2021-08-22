package info.ravali.serviceinterface;


import java.util.List;

import org.springframework.stereotype.Repository;

import info.ravali.entity.Contact;

@Repository
public interface ContactService {

	public Boolean saveContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact getContactById(Integer cid);
	public Boolean deletContactById(Integer cid);
	
	
}
