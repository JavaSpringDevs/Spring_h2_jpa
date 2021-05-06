package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;
// habilita o uso do java repository em outras classes
public interface UserRepository extends JpaRepository<User, Long> {

}
