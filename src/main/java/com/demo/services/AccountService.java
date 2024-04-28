package com.demo.services;

import java.util.List;

import com.demo.dtos.AccountDTO;
import com.demo.entities.Account;
import com.demo.entities.Postings;

public interface AccountService {
	public List<AccountDTO> findAll();
}
