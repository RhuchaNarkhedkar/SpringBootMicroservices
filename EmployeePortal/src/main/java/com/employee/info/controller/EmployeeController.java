package com.employee.info.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.employee.info.model.Employee;
import com.employee.info.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee, BindingResult bindingResult,
			HttpServletRequest request) {
		service.saveEmployee(employee);
		return new ModelAndView("addEmployee", "employee", new Employee());
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAll() {
		return service.getAll();
	}

	@GetMapping("/getAllDepartment")
	public String getAllDept() {
		return restTemplate.exchange("http://localhost:8081/getAllDepartments", HttpMethod.GET, null, String.class)
				.getBody();

	}

	@GetMapping("/getEmployee/{firstname}")
	public List<Employee> getEmployeesByFirstname(@PathVariable String firstname) {
		return service.getEmployeesByFirstname(firstname);
	}

}
