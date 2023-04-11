package fk_practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main_stud
{

	public static void main(String[] args)
	{
		stud_dtls st = new stud_dtls();
		//st.setId(2);
//		st.setName("Nothing");
//		st.setEmail("abc@gmail.com");
//		st.setContact("42340023");
//		
//		stud_add ad = new stud_add();
//		ad.setCity("pune");
//		ad.setPin(3333);
//		ad.setState("mh");
//		ad.setSt(st);
		
		Configuration cfg = new Configuration();
		cfg.configure("fk_pra.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		 // s.beginTransaction();
		//s.save(st);
		
//		s.save(ad);
//		
//		s.getTransaction().commit();
//		
		stud_dtls stud = s.get(stud_dtls.class, 2);
		System.out.println("student id: " + stud.getId());
		System.out.println("student name: " + stud.getName());
		System.out.println("student email: " + stud.getEmail());
		System.out.println("student contact: " + stud.getContact());
		System.out.println("student city: " + stud.getCity());
		System.out.println("student pin: " + stud.getPin());
//		
		s.close();
		sf.close();
	}

}
