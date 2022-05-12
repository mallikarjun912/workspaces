package com.cg.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.employee.beans.Employee;
import com.cg.employee.utils.DatabaseConnection;
import com.cg.employee.utils.DateParsing;
import com.cg.employee.utils.EmployeeDBQueries;

public class EmployeeDaoImpl implements EmployeeDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	@Override
	public int addEmployee(Employee emp)  {
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

	@Override
	public int updateEmployee(Employee emp) {
		conn = DatabaseConnection.openConnection();
		int rows=0;
		try {
			pst = conn.prepareStatement(EmployeeDBQueries.EDITEMP);
			pst.setDouble(1, emp.getSalary());
			pst.setInt(2, emp.getEmpcode());
			rows = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
		return rows;
	}

	@Override
	public int deleteEmployeeByCode(int code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAllEmployees() {
		conn = DatabaseConnection.openConnection();
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp;
		try {
			pst = conn.prepareStatement(EmployeeDBQueries.GET_ALL_EMPLS);
			rs = pst.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setEmpcode(rs.getInt(1));
				emp.setEmpname(rs.getString(2));
				emp.setSalary(rs.getDouble(3)); 
				emp.setDoj(rs.getDate(4).toString());
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DatabaseConnection.closeConnection();
		}
		return empList;
	}

	@Override
	public Employee getEmployeeByCode(int code) {
		// TODO Auto-generated method stub
		return null;
	}

}
