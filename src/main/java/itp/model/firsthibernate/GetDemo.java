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
public class GetDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	System.out.println(factory.isClosed());
    	
    	Session session=factory.openSession();
    	
    	Student s1=session.get(Student.class, 1);
    	System.out.println(s1);
    	
    	System.out.println("Hi!!!!");
    	
    	Student s2=session.get(Student.class, 1);
    	System.out.println(s2);
    	
    	
    	System.out.println(s1==s2);
    	session.close();
    	factory.close();

    }
}
