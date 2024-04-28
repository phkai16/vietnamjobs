package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.entities.Postings;

public interface PostingRepository extends CrudRepository<Postings, Integer>{

}
