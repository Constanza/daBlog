package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,String> {

    @Query("SELECT u FROM User  u WHERE u.lastName=?1")
    User findByLastName(String lastName);
}
