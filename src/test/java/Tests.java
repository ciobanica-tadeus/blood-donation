import Model.Role;
import Model.User;
import db.DataBaseConfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

public class Tests {

    private SessionFactory sessionFactory;

    @Test
    public void testUsers(){

        SessionFactory sessionFactory  = DataBaseConfig.getSessionFactory();
        User user = new User("cioba@gmail.com", "bunacf?", Role.ADMIN);
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            session.persist(user);

            transaction.commit();


        }catch (Exception e){
            System.out.println("E NASPA RAU !!!");
            if (transaction != null)
                transaction.rollback();
        }finally {
            session.close();
        }
    }


}
