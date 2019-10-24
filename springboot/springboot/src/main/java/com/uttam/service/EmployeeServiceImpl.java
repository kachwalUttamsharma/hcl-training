package com.uttam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uttam.model.Employee;
import com.uttam.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeerepository;
	@Override
	public List<Employee> getAllEmployees() {
   List<Employee> employeelist = (List<Employee>) employeerepository.findAll();
   if(employeelist.size()>0) {
	   return employeelist;
   }else {
   return new ArrayList<Employee>();
	}
	}
	@Override
	public String addEmployee(String empstr) {
	JSONObject jsonObject = (JSONObject) JSONValue.parse(empstr);
	  Employee employee = new Employee();
	  employee.setName((String) jsonObject.get("name"));
	  long id1 = (long) jsonObject.get("id");
	  int id =(int) id1;
	  employee.setId(id);
	  employee.setSalary((double) jsonObject.get("salary"));
	  employeerepository.save(employee);
		return "Employee added successfully";
	}

	@Override
	public String addEmployees(String e) {
			JSONArray jsonArray = (JSONArray) JSONValue.parse(e);
			for(int i = 0; i< jsonArray.size();i++) {
				JSONObject jsonObject= (JSONObject) jsonArray.get(i);
			  Employee employee = new Employee();
			  employee.setName((String) jsonObject.get("name"));
			  long id1 = (long) jsonObject.get("id");
			  int id =(int) id1;
			  employee.setId(id);
			  employee.setSalary((double) jsonObject.get("salary"));
			  employeerepository.save(employee);
			}
		
		return "Employees added successfully";
	}
	@Override
	public String deleteEmployee(int id) {
		employeerepository.deleteById(id);
		return "employee deleted successfully";
	}
	@Override
	public String deleteAllEmployees(List<Employee> id) {
		employeerepository.deleteAll(id);
		return "All Employees are deleted";
	}
	@Override
	public Employee getEmployee(int id) {
	Optional<Employee> lst= employeerepository.findById(id);
		return lst.get();
	}
}