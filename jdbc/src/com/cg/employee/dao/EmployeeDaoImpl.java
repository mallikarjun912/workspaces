package com.cg.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.employee.beans.Employee;
import com.cg.employee.utils.DatabaseConnection;
import com.cg.employee.utils.EmployeeDBQueries;

public class EmployeeDaoImpl implements EmployeeDao{
	private Connection conn;
	private PreparedStatement pst;
	
	@Override
	public int addEmployee(Employee emp) {
		conn = DatabaseConnection.openConnection();
		int rows=0;
		try {
			pst = conn.prepareStatement(EmployeeDBQueries.ADDEMP);
			pst.setInt(1, emp.getEmpcode());
			pst.setString(2, emp.getEmpname());
			pst.setDouble(3, emp.getSalary());
			pst.setDate(4, DateParsing.converDate(emp.getDoj())); 
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
		return rows;
	}

}
