package com.demo.services;

import com.demo.entities.Postings;

public interface PostingService {
	public Iterable<Postings> findAll();
}
