package crudApp.dao;

import crudApp.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private LocalContainerEntityManagerFactoryBean entityManagerFactoryBean;

    @Override
    public void add(User user) {
        entityManagerFactoryBean.createNativeEntityManager(null).persist(user);
//        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
//        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
//        return query.getResultList();
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    @SuppressWarnings("unchecked")
    public User getUserById(int id) {
//        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User where id=:id");
//        query.setParameter("id", id);
//        return query.getSingleResult();
        return null;
    }
}
