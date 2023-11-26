package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
