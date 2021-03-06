package com.example.expense.controller;
import java.net.URI;

import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.expense.model.Category;
import com.example.expense.model.Expense;
import com.example.expense.repository.ExpenseRepository;

@RestController
@RequestMapping("/api")
public class ExpenseController {
	
	@Autowired
	
	private ExpenseRepository expenseRepository;
	
	
	@GetMapping("/expenses")
	List<Expense>  getExpenses(){
		return expenseRepository.findAll();
		
		
	}
	
	@DeleteMapping("/expenses/{id}")
		ResponseEntity<?> deleteExpense(@PathVariable Long id){
			expenseRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
	


@PostMapping("/expenses")
ResponseEntity<Expense> createExpense(@Valid @RequestBody Expense expense)  throws URISyntaxException {
	Expense result=expenseRepository.save(expense);
	return ResponseEntity.created(new URI("/api/expense"+ result.getId())).body(result);
}
}





	
	

