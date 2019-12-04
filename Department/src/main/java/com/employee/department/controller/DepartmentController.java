package com.employee.department.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.employee.department.dao.DepartmentRepository;
import com.employee.department.model.Department;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentRepository repository;

	@PostMapping("/saveDepartment")
	public ModelAndView saveEmployee(@ModelAttribute Department department, BindingResult bindingResult,
			HttpServletRequest request) {
		repository.save(department);
		return new ModelAndView("addDepartment", "department", new Department());
	}

	@GetMapping("/getAllDepartments")
	public List<Department> getAll() {
		return repository.findAll();
	}

}
