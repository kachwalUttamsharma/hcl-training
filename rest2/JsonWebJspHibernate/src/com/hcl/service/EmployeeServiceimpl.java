package com.hcl.service;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hcl.dao.Employeedao;
import com.hcl.dao.Employeedaoimpl;
import com.hcl.model.Employee;
@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeServiceimpl implements EmployeeService{
	Employeedao employeedao= new Employeedaoimpl();
	@Override
	@GET
	@Path("/get")
	public List<Employee> getAllEmployees() {
			return employeedao.getAllEmployee();
		
	}

}
