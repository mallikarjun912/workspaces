package jdbc;

import java.sql.*;

import org.postgresql.Driver;
public class TestDB {
	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:postgresql://localhost:5432/cgapr22";
		Connection conn = DriverManager.getConnection(url, "postgres", "post");
		System.out.println("connection success");
		
		String qry1 = "insert into employee values(444,'fromjava',65000,'TRAINING')";
		Statement st = conn.createStatement();
		//st.executeUpdate(qry1);
		
		String qry2 = "insert into employee values(?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(qry2);
		pst.setInt(1, 567);
		pst.setString(2, "java2");
		pst.setDouble(3, 45000);
		pst.setString(4, "HR"); 
		pst.executeUpdate();
		System.out.println("inserted");  
	}
}
