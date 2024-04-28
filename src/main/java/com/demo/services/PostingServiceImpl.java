package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Postings;
import com.demo.repositories.PostingRepository;
@Service
public class PostingServiceImpl implements PostingService{
	@Autowired
	private PostingRepository postingRepository;
	@Override
	public Iterable<Postings> findAll() {
		return postingRepository.findAll();
	}

}
