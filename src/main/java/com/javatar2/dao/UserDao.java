package com.javatar2.dao;

import com.javatar2.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAllUser();

    User getUserById(int id);

    void addUser(User user);

    void editUser(User user);

    void deleteUser(User user);
}
