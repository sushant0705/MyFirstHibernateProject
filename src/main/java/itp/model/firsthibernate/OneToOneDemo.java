// OneToOneDemo.java
package itp.model.firsthibernate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import itp.model.firsthibernate.model.*;

public class OneToOneDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        ChiefMinister cm1 = new ChiefMinister();
        cm1.setCmname("Fadnavis");
        cm1.setAge(56);

        ChiefMinister cm2 = new ChiefMinister();
        cm2.setCmname("Sharma");
        cm2.setAge(85);

        State state1 = new State();
        state1.setSname("Maharashtra");
        state1.setCapital("Mumbai");
        state1.setChiefMinister(cm1);

        State state2 = new State();
        state2.setSname("Rajasthan");
        state2.setCapital("Jaipur");
        state2.setChiefMinister(cm2);

        session.save(state1);
        session.save(state2);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("✅ Records inserted successfully!");
    }
}
