package com.cg.employee.service;

import java.util.List;

import com.cg.employee.beans.Employee;

public interface EmployeeService {
	int addEmployee(Employee emp) ;
	int updatEmployee(Employee emp);
	List<Employee> getAllEmployees();
}
