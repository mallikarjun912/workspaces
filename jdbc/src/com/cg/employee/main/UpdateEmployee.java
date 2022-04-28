package com.cg.employee.main;

import com.cg.employee.beans.Employee;
import com.cg.employee.service.EmployeeService;
import com.cg.employee.service.EmployeeServiceImpl;

public class UpdateEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		EmployeeService service = new EmployeeServiceImpl();
		emp.setEmpcode(101);
		emp.setSalary(25000); 
		int rows = service.updatEmployee(emp);
		if(rows>0)
			System.out.println("updated");
		else
			System.out.println("not-updated");   
	}

}
