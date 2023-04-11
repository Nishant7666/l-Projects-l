package fk_practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class stu_edu {

	public static void main(String[] args) 
	{
		 stud_dtls sd = new stud_dtls();
		 
		 sd.setName("aruna");
		 sd.setEmail("aruna@gmail.com");
		 sd.setContact("223423423");
		
		 education e1 = new education();
		 e1.setTitle("10th");
		 e1.setPercent(78.90);
		 e1.setPyear(2014);
		 e1.setStud(sd);
		 
		 education e2 = new education();
		 e1.setTitle("12th");
		 e1.setPercent(80.90);
		 e1.setPyear(2012);
		 e1.setStud(sd);
		 
		 education e3 = new education();
		 e1.setTitle("BE.Tech");
		 e1.setPercent(80.90);
		 e1.setPyear(2014);
		 e1.setStud(sd);
		 
		 Configuration cfg = new Configuration();
		 cfg.configure("fk_pra.xml");
		 SessionFactory sf = cfg.buildSessionFactory();
		 
		 Session ss = sf.openSession();
		 
		 ss.beginTransaction();
		 
		 ss.save(e1);
		 ss.save(e2);
		 ss.save(e3);
	 	 
		 ss.getTransaction().commit();
		 
		ss.close();
		sf.close();

	}

}
