package com.hcl.Hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hcl.Hib.Department;

public class DepartmentSearch {
	public static void main(String[] args) {
		int deptno=1;
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department WHERE deptno="+deptno);
		List<Department> lstDepartment=q.list();
		Department e=lstDepartment.get(0);
		if(e!=null){
			System.out.println("Name "+e.getDname());
			System.out.println("loc "+e.getLoc());
		}else{
			System.out.println("Record Not Found");
		}
		}
}
