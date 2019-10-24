<<<<<<< HEAD
package com.hcl.department;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
 private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public void departmentInsert(){
	  int deptno;
	  String dname;
	  String loc;
	  String head;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the department number");
	 deptno=Integer.parseInt( sc.nextLine());
	 System.out.println("Enter the department name");
	 dname=sc.nextLine();
	 System.out.println("Enter the location ");
	 loc=sc.nextLine();
	 System.out.println("Enter the head");
	 head=sc.nextLine();
	 String cmd="insert into department values(?,?,?,?)";
	 jdbcTemplate.update(cmd,new Object[]
			
			 { deptno,
			 dname,
			 loc,
			 head
			 });
	 System.out.println("data inserted...");
}
 
}
=======
package com.hcl.department;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
 private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public void departmentInsert(){
	  int deptno;
	  String dname;
	  String loc;
	  String head;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the department number");
	 deptno=Integer.parseInt( sc.nextLine());
	 System.out.println("Enter the department name");
	 dname=sc.nextLine();
	 System.out.println("Enter the location ");
	 loc=sc.nextLine();
	 System.out.println("Enter the head");
	 head=sc.nextLine();
	 String cmd="insert into department values(?,?,?,?)";
	 jdbcTemplate.update(cmd,new Object[]
			
			 { deptno,
			 dname,
			 loc,
			 head
			 });
	 System.out.println("data inserted...");
}
 
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
