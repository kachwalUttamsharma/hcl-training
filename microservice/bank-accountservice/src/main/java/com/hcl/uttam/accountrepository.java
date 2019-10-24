package com.hcl.uttam;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accountrepository extends CrudRepository<account, Integer> {

	
	public  List<account> getAccountByUserid(int userid);
	
	
}
