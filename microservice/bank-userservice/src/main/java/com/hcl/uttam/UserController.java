package com.hcl.uttam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {

	@Autowired
	UserRepositoryimpl userRepositoryimpl;
	
	@RequestMapping("/Authentication/{name}")
	public ResponseEntity<User> getUser(@PathVariable("name") String user) {
		System.out.println("UserController : " + user);
		User userObj =  userRepositoryimpl.userAuthentication(user);
		return new ResponseEntity<User>(userObj,new HttpHeaders(),HttpStatus.OK);
	}
}
