package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
