package com.example.demo.entity;

import java.util.Set;

import javax.persistence.*;
//cria uma entidade
@Entity
public class User {
    // define o campo que será a chave primaria
	@Id
	//gera um valor de acordo com o banco, e tipagem do dado
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	private String name;
	private String email;
	
	public User() {
		super();
	}  
	
	//um construtor para um objeto
	public User(String name, String email) {

		this.name = name;
		this.email = email;
	}

	//cria um relacionamento muitos pra muitos
	@ManyToMany
	private Set<Rule> roles;
	
	//get´s e set´s 
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
