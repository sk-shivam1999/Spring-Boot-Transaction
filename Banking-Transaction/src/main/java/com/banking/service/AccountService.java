package com.banking.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.controller.AccountForm;
import com.banking.entity.Account;
import com.banking.entity.Bank;
import com.banking.repository.AccountRepository;
import com.banking.repository.BankRepoistory;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private BankRepoistory bankRepoistory;
	
	public String bankAcc(AccountForm accountForm) {
		
		Account account= new ObjectMapper().convertValue(accountForm, Account.class);
		
		int aid= accountRepository.save(account).getAid();
		
		Bank bank = new Bank("Yash","IMP0000",aid);
		
		bankRepoistory.save(bank);
		
		
		
		
		return "Successful";
		
	}

}
