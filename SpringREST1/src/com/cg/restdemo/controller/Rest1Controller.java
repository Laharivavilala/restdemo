package com.cg.restdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.restdemo.service.IAccountService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class Rest1Controller {

	@Autowired
	IAccountService service;

	@RequestMapping(value = "/employee/search/{id}", headers = "Accept=application/json", method = RequestMethod.GET)
	public String searchCustomerId(@PathVariable("id") int id) {
		
		service.searchCustomerId(id);


		return "showBalance";
	}

	@RequestMapping(value="searchaccount",method=RequestMethod.GET)
	public String accountSearch(@RequestParam("eid") int id){
		
		return "searchAccount";
	
		}
}
