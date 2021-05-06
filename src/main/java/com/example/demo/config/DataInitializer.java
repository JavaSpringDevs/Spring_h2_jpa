package com.example.demo.config;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		List<User> users = userRepository.findAll();
		
		if(users.isEmpty()) 
		{
			createUser("pietro ", " pietrodipaulo4@gmail.com");
			createUser("joão", "joão@gmail.com");
			createUser("maria", "maria@gmail.com");
;
		}
		User user = userRepository.getOne(2l);
		System.out.println(user.getName());
	}
	public void  createUser(String nome, String email) {
		User user = new User(nome, email);
				userRepository.save(user);
	}

}
