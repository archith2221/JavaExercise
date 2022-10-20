package com.valtech.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valtech.account.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
