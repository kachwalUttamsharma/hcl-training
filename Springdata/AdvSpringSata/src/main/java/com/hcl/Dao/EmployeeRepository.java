package com.hcl.Dao;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.employee;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<employee, Integer>{

 @Query("SELECT e FROM employee e WHERE Dept = ?1 AND Desig = ?2")
 List<employee>findByDeptAndDesign(String department,String designation);
 
 @Query("SELECT e FROM employee e WHERE Dept = ?1 AND Desig = ?2")
 List<employee>findByDept(String department,String designation);
 
 @Query("SELECT e FROM employee e WHERE Basic>= ?1 and Dept = ?2 and Desig = ?3")
 List<employee>findByBasic(int basic, String department,String designation);
 
 @Query("SELECT e FROM employee e WHERE Dept = ?1 AND Desig = ?2")
	List<employee>findByDesig(String department,String designation);
 
@Query("SELECT e FROM employee e WHERE Basic>= ?1 and Dept = ?2 and Desig = ?3 and Name like '%r'")
List<employee>findByName(int basic, String department,String designation,Sort sort);

@Query("SELECT e FROM employee e WHERE Dept=?1")
List<employee>findByDept(String department,Sort sort);



}


