package pro.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HiberApi {
public static void main(String[] args) {
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	Employee e=new Employee();
	e.setId(12);
	e.setName("Marish Mokal");
	
	FullTimeEmployee f=new FullTimeEmployee();
	f.setName("Vaibhav Vyavahare");
	f.setSalary(5000);
	
	PartTimeEmployee p=new PartTimeEmployee();
	p.setName("Pranav Ketagale");
	p.setHourlyPay(12);
	
	Session session=factory.openSession();
	Transaction txn=session.beginTransaction();
	
	session.save(e);
	session.save(f);
	session.save(p);
	txn.commit();
	session.close();
	factory.close();
	
}
}
