package info.ravali.serviceimplementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.ravali.entity.Contact;
import info.ravali.repository.ContactRepository;
import info.ravali.serviceinterface.ContactService;

@Service
public class ContactServiceImp implements ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public Boolean saveContact(Contact contact) {
		Contact con = new Contact();
		con.setContactName("ishu");
		con.setContactEmail("ishu@gmail.com");
		con.setContactNumber(8989674534l);
		con.setActiveSwitch('y');
		 Contact save = contactRepository.save(con);
		if(save!=null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> findAll = contactRepository.findAll();
		return findAll;
	}

	@Override
	public Contact getContactById(Integer cid) {
		Contact orElse = contactRepository.findById(cid).orElse(null);
		return orElse;
	}

	@Override
	public Boolean deletContactById(Integer cid) {
		Boolean deletContactById = deletContactById(cid);
		if(deletContactById!=null) {
			return true;
		}
		return false;
	}


}
