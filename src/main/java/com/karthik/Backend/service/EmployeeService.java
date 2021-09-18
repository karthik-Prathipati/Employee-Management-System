package com.karthik.Backend.service;

import java.util.List;

import com.karthik.Backend.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployee(long id);

	Employee updateEmployee(Employee employee, long id);

	void deleteEmployee(long id);
}
