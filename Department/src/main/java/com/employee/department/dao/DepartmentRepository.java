package com.employee.department.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.department.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}