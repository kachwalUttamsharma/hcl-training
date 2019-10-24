package com.uttam.service;

import java.util.List;

import com.uttam.model.Employee;

public interface EmployeeService {
 
	public List<Employee> getAllEmployees();

  public String addEmployee(String empstr);
  
  public String addEmployees(String e);
  
  public String deleteEmployee(int id);
  
  public String deleteAllEmployees(List<Employee> id);
  
  public Employee getEmployee(int id);
}
