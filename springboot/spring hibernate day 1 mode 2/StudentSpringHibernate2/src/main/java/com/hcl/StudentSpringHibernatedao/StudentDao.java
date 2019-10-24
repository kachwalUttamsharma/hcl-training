package com.hcl.StudentSpringHibernatedao;

import com.hcl.StudentSpringHibernate.model.Student;

public interface StudentDao {
  public boolean addStudent(Student st);
  public boolean upateStudent(Student st);
  public Student getStudent(int Rollnum);
  
}
