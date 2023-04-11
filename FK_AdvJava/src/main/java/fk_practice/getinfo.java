package fk_practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class getinfo {

	public static void main(String[] args) 
	{
		 Configuration cfg = new Configuration();
		 cfg.configure("fk_pra.xml");
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session session = sf.openSession();
		 session.beginTransaction();
		 
		 
		 stud_dtls sd = session.get( stud_dtls.class, 3);
		 System.out.println("name :" +  sd.getName());
		 System.out.println("name :" +  sd.getAddress().getCity());
		 System.out.println("name :" +  sd.getAddress().getPin());
		 
		 for (education e : sd.getEdu())
		 {
			 System.out.println("name :" +  e.getTitle());
			 
		 }
	}

}
