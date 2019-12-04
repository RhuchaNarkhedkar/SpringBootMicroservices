package com.employee.department.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.department.model.Department;

@Controller
public class AddDepartment {
	@RequestMapping(value = "/addDepartment", method = RequestMethod.GET)
	public ModelAndView addDepartment() {
		return new ModelAndView("addDepartment", "department", new Department());
	}

}
