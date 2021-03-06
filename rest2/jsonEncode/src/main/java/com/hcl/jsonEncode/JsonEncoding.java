package com.hcl.jsonEncode;

 import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.hcl.model.Employee;

public class JsonEncoding {
  public static void main(String[] args) {
 JSONParser jsonParser=new JSONParser();
 List<Employee>employees=new ArrayList<Employee>();
 try {
	FileReader f= new FileReader("C:/Users/Coalesce/Downloads/employ.json");
	Object object= jsonParser.parse(f);
	JSONObject jsonObject = (JSONObject) object;
	JSONObject jsonObject2 = (JSONObject) jsonObject.get("employees");
	JSONArray jsonArray = (JSONArray) jsonObject2.get("employee");
	System.out.println(jsonArray.size());
	for (int i = 0; i < jsonArray.size(); i++) {
		  JSONObject obj = (JSONObject) jsonArray.get(i);
		   Long empno = (Long) obj.get("empno");
		   String empname = (String) obj.get("empname");  
		    Long salary = (Long) obj.get("salary");  
		    String band = (String) obj.get("band");  
		    String date=(String) obj.get("dateofjoin");
		    Employee employee = new Employee();
		    employee.setEmpno(empno);
		    employee.setEmpname(empname);
		    employee.setSalary(salary);
		    employee.setBand(band);
		    employee.setDateofjoin(date);
		    employees.add(employee);
		    System.out.println(empno+"   "+empname+"   "+salary+"   "+band+"   "+date);  
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (org.json.simple.parser.ParseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 System.out.println(employees.size());
 employees.stream().forEach(a->System.out.println(a.getEmpno()+ "--" + a.getEmpname() +  "--" + a.getBand() + "--"+a.getSalary() + "--" +a.getDateofjoin()));
}
}
