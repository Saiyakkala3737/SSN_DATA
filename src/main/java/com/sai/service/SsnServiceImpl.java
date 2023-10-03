package com.sai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.repository.SSNRepository;


@Service
public class SsnServiceImpl {

	@Autowired
	private SSNRepository repo;

	public String getStateName(Long ssn_number) {
		boolean exist=repo.existsBySsnNumber(ssn_number);
		if(exist) {
			return "Rhode Island";
		}
		return "Not belongs to Rhode Islands state";
	}
}
