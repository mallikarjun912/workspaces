package com.cg.employee.main;

import java.util.Scanner;

import com.cg.employee.beans.Employee;
import com.cg.employee.service.EmployeeService;
import com.cg.employee.service.EmployeeServiceImpl;

public class AddEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		EmployeeService service = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code name salary doj(dd-mm-yyyy)");
		emp.setEmpcode(sc.nextInt());
		emp.setEmpname(sc.next());
		emp.setSalary(sc.nextDouble());
		emp.setDoj(sc.next());
		int rows = service.addEmployee(emp);
		if(rows>0)
			System.out.println("inserted");
		else
			System.out.println("not inserted");
 		
	}
}
