package com.cg.employee.main;

import java.util.List;

import com.cg.employee.beans.Employee;
import com.cg.employee.service.EmployeeService;
import com.cg.employee.service.EmployeeServiceImpl;

public class GetAllEmployees {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		List<Employee> emplist = service.getAllEmployees();
		emplist.forEach((emp)->System.out.println(emp.getEmpcode()+" "+
		emp.getEmpcode()+" "+emp.getSalary()+" "+emp.getDoj()));
	}

}
