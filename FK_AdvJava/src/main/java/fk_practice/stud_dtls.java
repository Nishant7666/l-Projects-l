package fk_practice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import oracle.net.jdbc.TNSAddress.Address;

@Entity
public class stud_dtls 
{
	@GeneratedValue(generator="stud_seq" , strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "stud_seq" , initialValue = 1 , allocationSize = 1)
	@Id
	private int id;
	private String name;
	private String email;
	private String contact;
	
	@OneToOne(mappedBy = "st") // used to link between tables known as bi-directional relation
	private stud_add address;
	
	@OneToMany(mappedBy = "st",fetch = FetchType.EAGER )
	private List<education> edu;
 
	public stud_add getAddress() {
		return address;
	}
	public void setAddress(stud_add address) {
		this.address = address;
	}
	public List<education> getEdu() {
		return edu;
	}
	public void setEdu(List<education> edu) {
		this.edu = edu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPin() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
