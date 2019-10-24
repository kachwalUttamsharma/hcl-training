package com.javainterviewpoint;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e join fetch e.employeeAddress ea where ec.country = :country")
	List<Employee> findEmpByCountry(@Param("country") String country);

	@Query("select distinct e from Employee e join fetch e.employeeAddress ea where eo.country = :country order by ec.state Desc")
	List<Employee> findEmpByState(@Param("country") String country);

	@Query("select distinct e from Employees e join fetch e.employeeAddress ea where ea.cuuntry = :country order by ea.city  ")
	List<Employee> findEmpByCity(@Param("country") String country);
}
