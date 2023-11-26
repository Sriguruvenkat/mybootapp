package com.example.crud.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Account;
import com.example.crud.model.Order;
import com.example.crud.repository.AccountRepository;
import com.example.crud.repository.OrderRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private AccountRepository accRepo;
	@Autowired
	private OrderRepository orderRepo;
	
	@Override
	public Account saveAccount(Account account) {
		return accRepo.save(account);
	}
	
	@Override
	public List<Account> fetchAllAccounts(){
		return (List<Account>)accRepo.findAll();
	}
	@Override
	public Account fetchAccount(Long AccountNumber) {
		Optional<Account> evenDB=accRepo.findById(AccountNumber);
		Account aresponse=evenDB.get();
		return aresponse;
	}
	
	
	
	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepo.save(order);
	}

	@Override
	public List<Order> fetchallOrders() {
		// TODO Auto-generated method stub
		return (List<Order>)orderRepo.findAll();
	}

	@Override
	public Order fetchOrder(Long orderNumber) {
		// TODO Auto-generated method stub
		Optional<Order> oddDB=orderRepo.findById(orderNumber);
		Order Oresponse=oddDB.get();
		return Oresponse;
	}

}
