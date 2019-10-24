package com.hcl.StudentSpringHibernate.service;

import com.hcl.StudentSpringHibernate.model.Student;

public interface StudentManager {
	 public boolean addStudent(Student st);
	  public boolean upateStudent(Student st);
	  public Student getStudent(int Rollnum);
}
