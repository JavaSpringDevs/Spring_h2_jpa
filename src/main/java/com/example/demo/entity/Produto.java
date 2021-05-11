package com.example.demo.entity;
import javax.persistence.*;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

}
