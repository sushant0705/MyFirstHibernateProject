package itp.model.firsthibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import itp.model.firsthibernate.model.State;

/**
 * Hello world!
 *
 */
public class CascadeDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	State myState=session.get(State.class,1); //no query

    	session.delete(myState);
    	tx.commit();
    	
    	session.close();
    	factory.close();

    }
}

//Create - save()
//Read
//U
//D
