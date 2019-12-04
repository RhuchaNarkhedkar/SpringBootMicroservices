package com.employee.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.info.model.Employee;

@Controller
public class AddEmployee {
	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		return new ModelAndView("addEmployee","employee",new Employee());
	}
	
}
