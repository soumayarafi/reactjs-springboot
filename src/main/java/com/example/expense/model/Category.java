package com.example.expense.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Table(name="category")
public class Category implements Serializable {
	 @Id
	private Long id;
	 //Travel,Grocery,...
	@NonNull
	private String name;
	
	

}
