package com.ers.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ers.models.User;


@Repository("userDao")
@Transactional
public interface UserDao extends JpaRepository<User, Integer> {

    @Query("from User where username = :username")
    Optional<User> findUserByUsername(String username);
    @Query("from User where email = :email")
    Optional<User> findUserByEmail(String email);
}
