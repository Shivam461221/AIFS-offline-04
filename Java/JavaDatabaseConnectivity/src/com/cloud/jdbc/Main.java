package com.cloud.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost/mydb";
		String username = "root";
		String password = "root";
		
		String INSERT_QUERY = "insert into employees (id, name, email, department_id, salary) values (?, ?, ?, ?, ?)";
		
//		try {
//			Connection connection = DriverManager.getConnection(URL, username, password);
//			
//			Statement stmt = connection.createStatement();
//			
//			//select query 
//			ResultSet rs = stmt.executeQuery("select * from employees");
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt("id")+", "+rs.getString("name")+", "+rs.getString("email"));
//			}
//			
//			rs.close();
//			stmt.close();
//			connection.close();
//			
//		}
//		catch(SQLException e) {
//			System.out.println(e);
//		}
		
//		try {
//			Connection connection = DriverManager.getConnection(URL, username, password);
//			
//			Statement stmt = connection.createStatement();
//			int id = 0;
//			//insert, update and delete
//			int result = stmt.executeUpdate("delete from employees where id = "+id);
//			System.out.println(result+" rows affected");
//			
//			stmt.close();
//			connection.close();
//			
//		}
//		catch(SQLException e) {
//			System.out.println(e);
//		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insert name");
		String name = sc.nextLine();
	
		
		System.out.println("Insert email");
		String email = sc.nextLine();
		
		
		System.out.println("Insert department id");
		int departmentId = sc.nextInt();
		
		System.out.println("Insert salary");
		double salary = sc.nextDouble();
		
		try {
			Connection connection = DriverManager.getConnection(URL, username, password);
			
			PreparedStatement pstmt = connection.prepareStatement(INSERT_QUERY);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setInt(4, departmentId);
			pstmt.setDouble(5, salary);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + " rows inserted");
			pstmt.close();
			connection.close();
			
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
		sc.close();
		
	}
}
