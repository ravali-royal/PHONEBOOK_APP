package info.ravali.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import info.ravali.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable>{

}
