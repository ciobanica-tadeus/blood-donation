package DAO;

import Model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDAO implements BasicDAO<User, Long>{

    private SessionFactory sessionFactory;

    public UserDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void create(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(user);
        transaction.commit();
        session.close();
    }

    @Override
    public User read(Long id) {
        Session session = sessionFactory.openSession();
        User findedUser = session.createQuery("select u from User u where u.id = " + id, User.class).getSingleResult();

        session.close();
        return findedUser;
    }

    @Override
    public User findByEmail(String email) {
        Session session = sessionFactory.openSession();
        User findedUser = session.createQuery("Select u FROM User u where u.email = " + "\"" + email + "\"", User.class).getSingleResult();

        session.close();
        return findedUser;
    }
}
