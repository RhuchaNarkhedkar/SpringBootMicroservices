package com.student.book;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.employee.info.dao.EmployeeRepository;
import com.employee.info.model.Employee;
import com.employee.info.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentLibraryApplicationTests {

	@Spy
	@InjectMocks
	private EmployeeService service;

	@Mock
	private EmployeeRepository repository;

	@Test
	public void getAllTest() {
		when(repository.findAll())
				.thenReturn(Stream.of(new Employee("aaa", "bbb", "ccc", 1, "1", 1.0)).collect(Collectors.toList()));
		assertEquals(1, service.getAll().size());
	}

	@Test
	public void saveEmployeeTest() {
		Employee employee = new Employee("aaa", "bbb", "ccc", 1, "1", 1.0);
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, service.saveEmployee(employee));
	}

}
