package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.User;
// habilita o uso do java repository em outras classes
public interface UserRepository extends JpaRepository<User, Long> {
	//@Query("SELECT * FROM User where name like %?1%"  )
 //User findByNameQualquerCoisa(String name);
 List<User> findByName(String name);
}
