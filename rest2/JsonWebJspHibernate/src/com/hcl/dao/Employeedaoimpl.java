package com.hcl.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hcl.model.Employee;

public class Employeedaoimpl implements Employeedao {

	@Override
	public List<Employee> getAllEmployee() {
  SessionFactory sf= HibernateUtil.getConnection();
  Session s=sf.getCurrentSession();
  Query q =s.createQuery("from Employees");
  List<Employee> employees = q.list();
  return employees;
		
	}
	}

