package com.demo.apiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.dtos.AccountDTO;
import com.demo.entities.Account;
import com.demo.entities.Postings;
import com.demo.services.AccountService;
import com.demo.services.PostingService;


@Controller
@RequestMapping("api/account")
public class AccountAPIController {
	@Autowired
	private AccountService accountService;
	@GetMapping(value = "findAll", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AccountDTO>> findAll(){
		try {
			return new ResponseEntity<List<AccountDTO>>(accountService.findAll(), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<AccountDTO>>(HttpStatus.BAD_REQUEST);
		}
	}
}
