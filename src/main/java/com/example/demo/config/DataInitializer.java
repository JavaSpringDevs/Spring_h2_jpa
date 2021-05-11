package com.example.demo.config;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
// cria uma componente e generaliza os eventos e declarações da aplicação
@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		//encontra todos os registros da entidade em forma de lista de objetos
		List<User> users = userRepository.findAll();
		
		//inicia e cria cadastro nos bancos
		if(users.isEmpty()) 
		{
			createUser("pietro ", " pietrodipaulo4@gmail.com");
			createUser("joão", "joão@gmail.com");
			createUser("maria", "maria@gmail.com");
;
		}
		// seleciona uma linha da tabela procurando pelo nome
		//User user = userRepository.findByNameQualquerCoisa("jo");
		//System.out.println(user.getEmail());
		// alterar o nome
		//user.setName("josé");
		//userRepository.save(user);
	}
	public void  createUser(String nome, String email) {
		User user = new User(nome, email);
				userRepository.save(user);
	}

}
