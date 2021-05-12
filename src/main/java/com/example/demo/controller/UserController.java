
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	//definição automatica do spring
	@Autowired
	private UserService userService;
	
	/*public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}*/
	
	@RequestMapping("/user")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userService.findAll());
		
		return "user";
		
	}
	
}