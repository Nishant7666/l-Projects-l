package fk_practice;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class education
{
	
	@GeneratedValue(generator="stud_seq" , strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "stud_seq" , initialValue = 1 , allocationSize = 1)
	@Id
	private int eid;
	private String title;
	private double percent;
	private int pyear;
	
	 @JoinColumn(name = "sid")
	 @ManyToOne(cascade = CascadeType.ALL)
	 private stud_dtls stud;
	 
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public int getPyear() {
		return pyear;
	}
	public void setPyear(int pyear) {
		this.pyear = pyear;
	}
	public stud_dtls getStud() {
		return stud;
	}
	public void setStud(stud_dtls stud) {
		this.stud = stud;
	}
	 
	 
	
}
