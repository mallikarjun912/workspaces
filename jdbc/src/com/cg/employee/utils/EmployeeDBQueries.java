package com.cg.employee.utils;

public class EmployeeDBQueries {
	public static final String ADDEMP = "insert into employee values(?,?,?,?)";
	public static final String EDITEMP = "update employee set salary=? where empcode=?";
	public static final String GET_ALL_EMPLS = "select * from employee";
}
