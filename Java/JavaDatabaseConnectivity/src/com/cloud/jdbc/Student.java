package com.cloud.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {

	private static String URL = "jdbc:mysql://localhost/student_db";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";
	private static Scanner scanner = new Scanner(System.in);

	private static Connection connection;

	public static void main(String[] args) {
		System.out.println("Student Management System");

		try {
			connectDatabase();

			boolean running = true;

			while (running) {
				showMenu();
				System.out.println("Enter your choice");
				int choice = scanner.nextInt();

				switch (choice) {
				case 1 -> addStudent();
				case 2 -> viewAllStudents();
				case 3 -> updateStudent();
				case 4 -> deleteStudent();
				case 5 -> searchStudent();
				case 0 -> {
					running = false;
					System.out.println("Good bye");
				}
				default -> System.out.println("Wrong choice, try again");
				}
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	private static void showMenu() {
		System.out.println("Enter your Choice");
		System.out.println("1 Add Student");
		System.out.println("2 View All Students");
		System.out.println("3 Update Student");
		System.out.println("4 Delete Student");
		System.out.println("5 Search Student");
		System.out.println("0 Exit");
	}

	private static void connectDatabase() throws SQLException {
		System.out.println("Connecting Database");
		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		System.out.println("Database Connected");
	}

	private static void addStudent() throws SQLException {
		scanner.nextLine();
		System.out.println("Enter Student name");
		String name = scanner.nextLine();

		System.out.println("Enter Student email");
		String email = scanner.nextLine();

		System.out.println("Enter Student age");
		int age = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter Student course");
		String course = scanner.nextLine();

		String sql = "INSERT INTO students (name, email, age, course) VALUES (?, ?, ?, ?)";

		try (PreparedStatement pstmt = connection.prepareStatement(sql);) {

			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, age);
			pstmt.setString(4, course);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result + " rows inserted");
			} else {
				System.out.println("Not inserted");
			}
		}

	}

	private static void viewAllStudents() throws SQLException {
		String sql = "SELECT * FROM students";

		try (PreparedStatement pstmt = connection.prepareStatement(sql);

				ResultSet rs = pstmt.executeQuery();) {

//			System.out.println("ID, Name, Email, Age, Course");
//			while (rs.next()) {
//				System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("email") + ", "
//						+ rs.getInt("age") + ", " + rs.getString("course"));
//			}

			// Print Table Header
			System.out.printf("%-5s %-20s %-30s %-5s %-15s%n", "ID", "Name", "Email", "Age", "Course");

			System.out.println("--------------------------------------------------------------------------");

			// Print Table Rows
			while (rs.next()) {
				System.out.printf("%-5d %-20s %-30s %-5d %-15s%n", rs.getInt("id"), rs.getString("name"),
						rs.getString("email"), rs.getInt("age"), rs.getString("course"));
			}
		}
	}

	private static void updateStudent() throws SQLException {
		scanner.nextLine();
		String sql_query = "UPDATE students set course = ? WHERE id = ?";

		System.out.println("Enter course to update");
		String course = scanner.nextLine();

		System.out.println("Enter student ID");
		int id = scanner.nextInt();

		try (PreparedStatement pstmt = connection.prepareStatement(sql_query);) {
			pstmt.setString(1, course);
			pstmt.setInt(2, id);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("Student details updated");
			} else {
				System.out.println("Student details not updated");
			}
		}

	}

	private static void deleteStudent() throws SQLException {
		//System.out.println("Delete");

		System.out.println("Enter Student ID: ");
		int id = scanner.nextInt();

		String sql = "DELETE FROM students where id = ?";

		try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setInt(1, id);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("Student with id: " + id + " Deleted");
			} else {
				System.out.println("Student  not deleted");
			}
		}
	}

	private static void searchStudent() throws SQLException {
		scanner.nextLine();
		System.out.println("Enter student name: ");
		
		
		String name = scanner.nextLine();
		
		String sql = "SELECT * FROM students where name LIKE ? ";
		
		try(PreparedStatement pstmt = connection.prepareStatement(sql)){
			
			
			pstmt.setString(1,"%"+name+"%");
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%-5d %-20s %-30s %-5d %-15s%n", rs.getInt("id"), rs.getString("name"),
						rs.getString("email"), rs.getInt("age"), rs.getString("course"));
			}
			
			rs.close();
		}
		
		
	}
}
