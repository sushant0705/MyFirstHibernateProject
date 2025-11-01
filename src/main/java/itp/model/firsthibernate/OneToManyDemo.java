package itp.model.firsthibernate;
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import itp.model.firsthibernate.model.Dept;
import itp.model.firsthibernate.model.Employee;

public class OneToManyDemo 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	
    	
    	Employee e1=Employee.builder()
    			.ename("Alice")
    			.sal(800.0)
    			.build();
    		
    	Employee e2=Employee.builder()
    			.ename("Ben")
    			.sal(900.0)
    			.build();
    			
    	
    	Employee e3=Employee.builder()
    			.ename("Chris")
    			.sal(1000.0)
    			.build();
 
    	
    	Employee e4=Employee.builder()
    			.ename("David")
    			.sal(1100.0)
    			.build();
    		
    	Dept d1=Dept.builder()
    			.dname("IT")
    			.city("Pune")
    			.build();
    	
    	Dept d2=Dept.builder()
    			.dname("Sales")
    			.city("Delhi")
    			.build();
    	
    	d1.setEmployees(Arrays.asList(e1,e2));
    	d2.setEmployees(Arrays.asList(e3,e4));
    	
    	
    	session.save(d1);
    	session.save(d2);
    	tx.commit();
    	session.close();
    	factory.close();

    }
}

//Create - save()
//Read
//U
//D
