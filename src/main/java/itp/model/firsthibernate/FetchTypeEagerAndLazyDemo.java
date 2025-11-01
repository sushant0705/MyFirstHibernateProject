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
public class FetchTypeEagerAndLazyDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	
    	State myState=session.load(State.class,1); //no query
    	
    	System.out.println(myState.getSname());
    	
    	System.out.println("HIII");
    	
    	System.out.println(myState.getChiefMinister().getCmname());
    	session.close();
    	factory.close();

    }
}

//Create - save()
//Read
//U
//D
