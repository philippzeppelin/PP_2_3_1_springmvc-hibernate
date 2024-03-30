package com.philippzeppelin.springmvc_hibernate.service;

import com.philippzeppelin.springmvc_hibernate.dao.UserDAO;
import com.philippzeppelin.springmvc_hibernate.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> showAllUsers() {
        return null;
    }

    @Override
    public User showUser(int id) {
        return null;
    }

    @Override
    public void save(User user) {
    }

    @Override
    public void update(int id, User updatedUser) {
    }

    @Override
    public void delete(int id) {
    }
}
