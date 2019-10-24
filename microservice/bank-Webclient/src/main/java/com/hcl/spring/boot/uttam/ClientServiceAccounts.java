package com.hcl.spring.boot.uttam;

import java.util.List;

public interface ClientServiceAccounts {

	
	
	public String addAccount(account account);
	
	public String deleteAccount(int accoutnum);
	
	public List<account> getAccount(int userid);
}
