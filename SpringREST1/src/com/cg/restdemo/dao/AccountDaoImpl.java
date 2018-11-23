package com.cg.restdemo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.restdemo.bean.Account;

@Repository("accountDao")

public class AccountDaoImpl implements IAccountDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public Account searchCustomerId(int id) {
		Account account =entityManager.find(Account.class, id);
		
		return account;
	}

}
