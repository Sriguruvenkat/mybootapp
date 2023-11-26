package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Account;
import com.example.crud.model.Order;
import com.example.crud.service.DepartmentService;




@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService depService;
	
	@GetMapping("/accounts")
	public List<Account> fetchAllAccounts(){
		return depService.fetchAllAccounts();
	}
	
	@GetMapping("/accounts/{id}")
	public Account fetchAccount(@PathVariable("id") Long accNumber) {
		return depService.fetchAccount(accNumber);
	}
	
	@PostMapping("/accounts")
	public Account saveAccount(@Validated @RequestBody Account account) {
		return depService.saveAccount(account);
	}
	
	
	
	@GetMapping("/orders")
	public List<Order> fetchOrders(){
		return depService.fetchallOrders();
	}
	@GetMapping("/orders/{id}")
	public Order fetchoneOrder(@PathVariable("id") Long orderNumber) {
		return depService.fetchOrder(orderNumber);
	}
	
	@PostMapping("/orders")
	public Order createOrders(@Validated @RequestBody Order order) {
		return depService.saveOrder(order);
	}
}
