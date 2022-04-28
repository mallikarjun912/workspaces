package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.postgresql.Driver;

public class TestDB2 {

	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:postgresql://localhost:5432/cgapr22";
		Connection conn = DriverManager.getConnection(url, "postgres", "post");
		System.out.println("connection success"); 
		String qr1 = "update employee set salary=?, dept=? where code=?";
		PreparedStatement pst = conn.prepareStatement(qr1);
		pst.setDouble(1, 80000);
		pst.setString(2, "TRAINING");
		pst.setInt(3, 567);
		pst.executeUpdate();
		System.out.println("updated");  
		String qr2 = "delete from employee where code=?";
		pst = conn.prepareStatement(qr2);
		pst.setInt(1, 10);
		pst.executeUpdate();
		System.out.println("deleted");  
	}

}
