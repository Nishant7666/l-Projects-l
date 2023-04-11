package fk_practice;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class stud_add 
{
	@GeneratedValue(generator="product_seq" , strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "product_seq" , initialValue = 1 , allocationSize = 1)
	@Id
	private int id;
	private String city;
	private int pin;
	private String state;

	//@JoinColumn(name = "sid")
	@OneToOne (cascade = CascadeType.ALL,fetch = FetchType.EAGER)// or LAZY 
	private stud_dtls st;

	public stud_dtls getSt() {
		return st;
	}
	public void setSt(stud_dtls st) {
		this.st = st;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
