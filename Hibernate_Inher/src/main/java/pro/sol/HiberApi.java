package pro.sol;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HiberApi {
public static void main(String[] args) {
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	
	Collage c=new Collage();
	c.setC_id(12);
	c.setC_name("Sinhgad vadgaon campus");
	
	
	Student s =new Student();
	s.setS_id(112);
	s.setS_name("Vaibhav Vyavahare");
	s.setS_stream("Computer science");

	
	Subject s1=new Subject();
	s1.setSubject("OOPs");
	s1.setMarks(175);
	
	Session session=factory.openSession();
	Transaction txn=session.beginTransaction();
	
	
	session.save(c);
	session.save(s);
	session.save(s1);
	txn.commit();
	session.close();
	factory.close();
	
	
	
}
}
