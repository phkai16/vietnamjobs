package com.demo.services;

import java.util.List;

import org.modelmapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dtos.AccountDTO;
import com.demo.entities.Account;
import com.demo.entities.Postings;
import com.demo.repositories.AccountRepository;
import com.demo.repositories.PostingRepository;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public List<AccountDTO> findAll() {
		return mapper.map(accountRepository.findAll(), new TypeToken<List<AccountDTO>>() {}.getType());
	}

}
