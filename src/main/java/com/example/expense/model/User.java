package com.example.expense.model;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Table(name="user")
public class User implements Serializable {
	@Id 
	private Long id;
	private String name;
	private String email;
	
}
