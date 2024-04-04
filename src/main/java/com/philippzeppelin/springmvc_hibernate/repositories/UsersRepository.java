package com.philippzeppelin.springmvc_hibernate.repositories;

import com.philippzeppelin.springmvc_hibernate.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}