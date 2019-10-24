package com.uttam.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uttam.model.Employee;
import com.uttam.service.EmployeeService;
@RequestMapping("/employee")
@RestController
public class EmployeeController {
	
	@Autowired(required = true)
	private EmployeeService employeeservice;
	@RequestMapping("/getAll")
  public ResponseEntity<List<Employee>> getAllEmployees(){
	  List<Employee> list= employeeservice.getAllEmployees();
	  return new ResponseEntity<List<Employee>>(list,new HttpHeaders(),HttpStatus.OK);
  }
	
	@RequestMapping("/addEmployee")
	public String addEmployee(@RequestBody String empstr) {
		return employeeservice.addEmployee(empstr);
	}
	@PostMapping("/addEmployees")
	public String addEmployees(@RequestBody String e) {
		return employeeservice.addEmployees(e);
	}
	
	@DeleteMapping("/{id}/delete")
	public String deleteEmployee(@PathVariable("id") int id) {
		return employeeservice.deleteEmployee(id);
		
	}
	
	@PostMapping("/deleteAll")
	public String deleteAllEmployee(@RequestBody List<Employee> id) {
		return employeeservice.deleteAllEmployees(id);
	}
	
	@PostMapping("/{id}/getEmployee")
	public Employee getEmployee(@PathVariable("id") int id) {
		return employeeservice.getEmployee(id);
		
	}
}
