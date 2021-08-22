package info.ravali.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import info.ravali.entity.Contact;
import info.ravali.serviceimplementation.ContactServiceImp;

@Controller
public class ContactController {

	@Autowired
	private ContactServiceImp contactserviceimp;

	@GetMapping("/about")
	public String checked(Model model) {
		String msg = "Hello SpringBoot";
		model.addAttribute("msg", msg);
		return "index";
	}
	@GetMapping("/savedata")
	public String saveData(Contact contact,Model model) {
		Boolean saveContact = contactserviceimp.saveContact(contact);
		Model addAttribute = model.addAttribute("msg",saveContact);
		
		if(addAttribute!=null) {
			String str="ContactNumber successfully saved";
			model.addAttribute("msg",str);
		}else {
			String str="ContactNumber not saved";
			model.addAttribute("msg",str);
		}
		return "savemsg";
	}

	@GetMapping("/getdata")
	public String getAllDetails(Contact contact, Model model) {
		model.addAttribute("msg", contactserviceimp.getAllContacts());
		return "contact";
	}
	@GetMapping("/getbyid")
	public String findbyid(Contact conatct,Model model) {
		Contact contactById = contactserviceimp.getContactById(1);
		model.addAttribute("id",contactById);
		
		return "getbyid";
	}
	@GetMapping("/deletbyid")
	public String deletById(Contact contact,Model model) {
		Boolean deletContactById = contactserviceimp.deletContactById(1);
		if(deletContactById==null) {
			String msg="contactNumber successfully deleted";
		model.addAttribute("key",msg);
		}else {
			String msg="contactNumber not deleted";
		model.addAttribute("key",msg);
		}
		
		return "deletbyid";
	}

}
