package com.sai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sai.service.SsnServiceImpl;

@RestController
public class SsnController {
	
	@Autowired
	private SsnServiceImpl service;

	@GetMapping("/ssn/{ssnNumber}")
	public ResponseEntity<String> getStateName(@PathVariable Long ssnNumber) {
		String statename=service.getStateName(ssnNumber);
		return new ResponseEntity<>(statename, HttpStatus.OK);
	}
	
	
}
