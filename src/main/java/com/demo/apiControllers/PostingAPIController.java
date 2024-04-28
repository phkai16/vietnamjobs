package com.demo.apiControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.entities.Postings;
import com.demo.services.PostingService;


@Controller
@RequestMapping("api/posting")
public class PostingAPIController {
	@Autowired
	private PostingService postingService;
	@GetMapping(value = "findAll", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<Postings>> findAll(){
		try {
			return new ResponseEntity<Iterable<Postings>>(postingService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Iterable<Postings>>(HttpStatus.BAD_REQUEST);
		}
	}
}
