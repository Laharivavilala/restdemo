package com.cg.restdemo.service;

import com.cg.restdemo.bean.Account;
import com.cg.restdemo.dao.IAccountDao;

public class AccountServiceImpl implements IAccountService{
    private IAccountDao accountDao;
	@Override
	public Account searchCustomerId(int id) {
		// TODO Auto-generated method stub
		return accountDao.searchCustomerId(id);
	}

}
