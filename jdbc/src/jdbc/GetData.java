package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.postgresql.Driver;

public class GetData {
	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		String url = "jdbc:postgresql://localhost:5432/cgapr22";
		Connection conn = DriverManager.getConnection(url, "postgres", "post");
		System.out.println("connection success");  
		String qry = "select * from employee";
		PreparedStatement pst = conn.prepareStatement(qry);
		ResultSet rs = pst.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		for(int i=1;i<=rsmd.getColumnCount();i++)
			System.out.print(rsmd.getColumnName(i)+" ");
		System.out.println("\n--------------------------------");  
		while(rs.next())
			System.out.println(rs.getInt("code")+" "+rs.getString(2)+" "+
					rs.getDouble(3)+" "+rs.getString(4));  
	}

}
