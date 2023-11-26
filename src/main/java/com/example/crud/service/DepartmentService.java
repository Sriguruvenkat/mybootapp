package com.example.crud.service;

import java.util.List;

import com.example.crud.model.Account;
import com.example.crud.model.Order;



public interface DepartmentService {
	Account saveAccount(Account account);
	
	List<Account> fetchAllAccounts();
	Account fetchAccount(Long AccountNumber);
	
	Order saveOrder(Order order);
	//Fetching accounts
	List<Order> fetchallOrders();
	Order fetchOrder(Long orderNumber);
	
}
