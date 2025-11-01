package itp.model.firsthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//
//import Project.Employee;
//import Project.Product;
import itp.model.firsthibernate.model.Student;

public class App {
    public static void main(String[] args) {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        System.out.println("Is factory closed? : " + factory.isClosed());

       
        Session session = factory.openSession();

       
        Transaction tx = session.beginTransaction();

        
      
        Student s1 = new Student("Virat", 98.5);
        Student s2 = new Student("Rohit", 88.5);
        Student s3 = new Student("Hardik", 78.5);
//        Employee e1 = new Employee(101, "Rohit", 85000.0, "IT");
//        Product p1 = new Product(201, "iPhone 16 Pro", 129999.0, "Electronics");
//
//        
        session.save(s1);
        session.save(s2);
        session.save(s3);
//        session.save(e1);
//        session.save(p1);

       
        tx.commit();

        System.out.println("✅ Records inserted successfully!");

        
        session.close();

        factory.close();

        System.out.println("Factory closed successfully!");
    }
}
