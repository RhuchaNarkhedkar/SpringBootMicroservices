package com.employee.info.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.info.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByFirstname(String firstname);

}