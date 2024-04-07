package com.philippzeppelin.springmvc_hibernate.dao;

import com.philippzeppelin.springmvc_hibernate.models.User;

import java.util.List;

public interface UserDAO {
    List<User> showAllUsers();

    User showUser(int id);

    void saveUser(User user);

    void updateUser(int id, User updatedUser);

    void deleteUser(int id);
}