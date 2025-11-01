package itp.model.firsthibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import itp.model.firsthibernate.model.Student;



/**
 * Hello world!
 *
 */
public class UpdateDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	System.out.println(factory.isClosed());
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	Student s1=session.get(Student.class, 1);	
   
    	s1.setPer(98.7);									
    	s1.setName("Virat Kohli");
    	session.save(s1);
    	tx.commit();
    	session.close();
    	factory.close();

    }
}

//Create - save()
//Read
//U
//D