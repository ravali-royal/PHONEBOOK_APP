package info.ravali.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Entity
@Data
@Table(name="CONTACT_TBL")
public class Contact {
	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Integer contactId;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;
	@Column(name="CONATCT_EMAIL")
	private String contactEmail;
	@Column(name="CONTACT_ACTIVESWITCH")
	private Character activeSwitch;
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDate CREATED_DATE;
	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDate UPDATED_DATE;
	
	
}
