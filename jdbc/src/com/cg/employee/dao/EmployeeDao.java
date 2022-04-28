package com.cg.employee.dao;

import java.util.List;

import com.cg.employee.beans.Employee;

public interface EmployeeDao {
	int addEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployeeByCode(int code);
	List<Employee> getAllEmployees();
	Employee getEmployeeByCode(int code);
}
