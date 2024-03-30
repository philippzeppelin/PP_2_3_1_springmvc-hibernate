package com.philippzeppelin.springmvc_hibernate.dao;

import com.philippzeppelin.springmvc_hibernate.models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {
    private final JdbcTemplate jdbcTemplate;

    public UserDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> index() {
        return null;
    }

    @Override
    public User show(int id) {
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
