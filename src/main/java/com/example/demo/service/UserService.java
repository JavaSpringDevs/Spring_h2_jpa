package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	
	public List<User> findAll(){
		
		return userRepository.findAll();
		
	}

}
