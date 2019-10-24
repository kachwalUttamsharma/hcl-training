package com.hcl.uttam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class accountController {

	@Autowired
	accountservice accountservice;
	
	@RequestMapping("/add")
	public String addAccount(@RequestBody account account) {
		return accountservice.addAccount(account);
	}
	
	@GetMapping("/getAccount/{id}")
	public List<account> getAccount(@PathVariable("id") int id) {
		System.out.println("AccountController : getAccount("+id+") ");
		return accountservice.getAccount(id);
}
	
	@RequestMapping("/deleteAccount/{accountnum}")
	public String deleteAccount(@PathVariable("accountnum")int accountnum) {
		return accountservice.deleteAccount(accountnum);
	}
}
