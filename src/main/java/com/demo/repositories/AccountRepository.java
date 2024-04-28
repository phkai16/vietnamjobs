package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.entities.Account;
import com.demo.entities.Postings;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}
