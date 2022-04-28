package com.cg.employee.test;

import static org.junit.Assert.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import org.junit.Test;

//import org.junit.jupiter.api.Test;
import com.cg.employee.beans.Employee;
import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.dao.EmployeeDaoImpl;

public class EmployeeDaoTest {
	EmployeeDao dao = new EmployeeDaoImpl();
	Employee emp = new Employee(306, "testing",4100,"05-02-2012");

	@Test
	public void testAddEmployee() {
		assertEquals(1, dao.addEmployee(emp));  
	}

	@Test(expected = SQLException.class)
	public void testSQLEXception() {
		assertEquals(1, dao.addEmployee(emp)); 
	}
}
