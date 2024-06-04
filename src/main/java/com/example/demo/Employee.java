package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;

@RestController
@Entity
public class Employee {

	Double Id;
	String name;
	String lastName;
	int age; 
	
	
}
