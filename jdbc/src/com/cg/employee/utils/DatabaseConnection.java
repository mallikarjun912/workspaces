package com.cg.employee.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class DatabaseConnection {
	private static Connection conn=null;
	public static Connection openConnection() {
		String url = "jdbc:postgresql://localhost:5432/cgapr22";
		try {
			DriverManager.registerDriver(new Driver());
			conn = DriverManager.getConnection(url,"postgres","post");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return conn;
	}
	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
