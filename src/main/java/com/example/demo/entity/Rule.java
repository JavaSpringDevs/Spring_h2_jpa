package com.example.demo.entity;
import javax.persistence.*;

@Entity
public class Rule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	private String name;
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
}
