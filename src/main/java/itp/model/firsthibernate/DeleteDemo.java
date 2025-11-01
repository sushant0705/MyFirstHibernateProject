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
public class DeleteDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	System.out.println(factory.isClosed());
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	Student s1=session.get(Student.class, 2);			//1 Surya 78.5	
   
    	session.delete(s1);
    	
    	tx.commit();
    	session.close();
    	factory.close();

    }
}

//Create - save()
//Read
//U
//D