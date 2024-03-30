package com.philippzeppelin.springmvc_hibernate.service;

import com.philippzeppelin.springmvc_hibernate.models.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();

    User showUser(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);
}
