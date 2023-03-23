package db;

import Model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataBaseConfig {
    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null){
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
