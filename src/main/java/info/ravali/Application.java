package info.ravali;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import info.ravali.entity.Contact;
import info.ravali.repository.ContactRepository;
@ComponentScan(value= {"info.ravali","info.ravali.entity","info.ravali.repository","info.ravali.controller","info.ravali.service","info.ravali.serviceimplementation"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactRepository repository = context.getBean(ContactRepository.class);
		Contact contact1 = new Contact();
		contact1.setContactName("Ravali");
		contact1.setContactEmail("ravali@gmail.com");
		contact1.setContactNumber(9897969594l);
		contact1.setActiveSwitch('Y');
		
		Contact contact2 = new Contact();
		contact2.setContactName("latha");
		contact2.setContactEmail("latha@gmail.com");
		contact2.setContactNumber(9897965674l);
		contact2.setActiveSwitch('Y');
		
		Contact contact3 = new Contact();
		contact3.setContactName("seetha");
		contact3.setContactEmail("seetha@gmail.com");
		contact3.setContactNumber(9797969594l);
		contact3.setActiveSwitch('Y');
		
		List<Contact> asList = Arrays.asList(contact1,contact2,contact3);
		List<Contact> saveAll = repository.saveAll(asList);
		saveAll.forEach(entity->System.out.println(entity));
	
		
		
	}

}
