package com.cg.employee.service;

import java.util.List;

import com.cg.employee.beans.Employee;
import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao dao = new EmployeeDaoImpl();
	
	@Override
	public int addEmployee(Employee emp) {
		int rows = dao.addEmployee(emp);
		return rows;
	}

	@Override
	public int updatEmployee(Employee emp) {
		int rows = dao.updateEmployee(emp);
		return rows;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> emplist = dao.getAllEmployees();
		return emplist;
	}

}
