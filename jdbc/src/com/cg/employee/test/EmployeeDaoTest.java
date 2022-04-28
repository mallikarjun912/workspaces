package com.cg.employee.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.employee.beans.Employee;
import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.dao.EmployeeDaoImpl;

class EmployeeDaoTest {
	EmployeeDao dao = new EmployeeDaoImpl();
	
	@Test
	public void testAddEmployee() {
		Employee emp = new Employee(605, "testing",4100,"05-02-2012");
		assertEquals(1, dao.addEmployee(emp));  
	}
}
