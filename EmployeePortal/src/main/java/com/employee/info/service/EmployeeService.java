package com.employee.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.info.dao.EmployeeRepository;
import com.employee.info.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> getAll() {
		return repository.findAll();
	}

	public List<Employee> getEmployeesByFirstname(@PathVariable String firstname) {
		return repository.findByFirstname(firstname);
	}
}
