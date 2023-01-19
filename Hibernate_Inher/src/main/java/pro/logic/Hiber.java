package pro.logic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hiber {
public static void main(String[] args) {
	
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	Showroom s=new Showroom();
	s.setShow_name("Pimpari");
	s.setId(123);
	
	Bike b=new Bike();
	b.setShow_name("Nigadi");
	b.setId(145);
	b.setChasisNo(1234);
	b.setColour("Black");
	b.setName("R15");
	 
	
	Car c=new Car();
	c.setShow_name("Pune");
	c.setId(146);
	c.setName("BMW");
	c.setWheels(5);
	
	Session session=factory.openSession();
	Transaction txn=session.beginTransaction();
	
	
	session.save(s);
	session.save(b);
	session.save(c);
	txn.commit();
	session.close();
	factory.close();
	
	
	
	
}
}
