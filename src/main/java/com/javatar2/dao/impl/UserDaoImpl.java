package com.javatar2.dao.impl;

import com.javatar2.dao.UserDao;
import com.javatar2.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<User> findAllUser() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from User");
        List<User> users = query.list();
        session.flush();
        return users;
    }

    public void addUser (User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
        session.flush();
    }

    public User getUserById (int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.get(User.class, id);
        session.flush();

        return user;
    }

    public List<User> getUserList() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from User");
        List<User> userList = query.list();
        session.flush();

        return userList;
    }

    public void editUser (User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
        session.flush();
    }

    public void deleteUser (User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
        session.flush();
    }
}
