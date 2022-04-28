package com.cg.employee.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.cg.employee.beans.Employee;
import com.cg.employee.dao.EmployeeDao;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDaoMockTest {
	@Mock
	EmployeeDao dao;
	
	@Test
	public void testAddEmployee() {
		Employee emp = new Employee(701, "Mockito",5000,"25-20-2002");
		Mockito.when(dao.addEmployee(emp)).thenReturn(0);
	}
}
