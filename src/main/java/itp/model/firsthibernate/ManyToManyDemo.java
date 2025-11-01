package itp.model.firsthibernate;



import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import itp.model.firsthibernate.model.Actor;
import itp.model.firsthibernate.model.Movie;



public class ManyToManyDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	
    	
    	Actor a1=Actor.builder()
    			.aname("SRK")
    			.age(59)
    			.build();
    	
    	Actor a2=Actor.builder()
    			.aname("DP")
    			.age(39)
    			.build();
    	
    	Movie m1=Movie.builder()
    			.mname("CE")
    			.ryear(2010)
    			.build();
    	
    	Movie m2=Movie.builder()
    			.mname("Don")
    			.ryear(2006)
    			.build();
    	
    	Movie m3=Movie.builder()
    			.mname("HP")
    			.ryear(2002)
    			.build();
    	
    	a1.setPortFolio(Arrays.asList(m1,m2));
    	a2.setPortFolio(Arrays.asList(m1));
    	
    	session.save(a1);
    	session.save(a2);
    	tx.commit();
    	session.close();
    	factory.close();

    }
}

//Create - save()
//Read
//U
//D