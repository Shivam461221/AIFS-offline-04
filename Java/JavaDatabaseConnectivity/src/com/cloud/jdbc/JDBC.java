package com.cloud.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {

		String URL = "jdbc:mysql://localhost/mydb";
		String username = "root";
		String password = "root";

		String Insert_Query = "insert into employees values (?, ?, ?, ?, ?)";

//		try {
//			Connection conn = DriverManager.getConnection(URL, username, password);
//			
//			Statement stmt = conn.createStatement();
//			
//			ResultSet rs = stmt.executeQuery("select * from employees");
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(3) );
//			}
//			
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}

//		try {
//			Connection conn = DriverManager.getConnection(URL, username, password);
//			
//			Statement stmt = conn.createStatement();
//			
//			int result = stmt.executeUpdate("insert into employees values(102, 'shyam', 'shyam@123', 3, 15000)");
//			
////			while(rs.next()) {
////				System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(3) );
////			}
//			
//			
//			System.out.println(result + "rows inserted");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}

		try (Connection conn = DriverManager.getConnection(URL, username, password);

				PreparedStatement stmt = conn.prepareStatement(Insert_Query);)
		{

			stmt.setInt(1, 105);
			stmt.setString(2, "xyz");
			stmt.setString(3, "xyz@123");
			stmt.setInt(4, 2);
			stmt.setDouble(5, 20000);

			int result = stmt.executeUpdate();

			System.out.println(result + "rows inserted");
			

		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
