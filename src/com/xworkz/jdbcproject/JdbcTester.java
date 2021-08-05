package com.xworkz.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTester {

	public static void main(String[] args) {

		String username = "root";
		String password = "4PM15IS@011";
		String url = "jdbc:mysql://127.0.0.1:3306/project";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection connection = null;
		// java.jdbc.Driver--> com.mysql.jdbc.Driver

		try {
			Class.forName(fqnOfDriverImpl);
			/* Connection */ connection = DriverManager.getConnection(url, username, password);

			String query = "insert into insurance_table values(123,'dhanya','Health Insurance',3,'LIC',45252)";
			Statement statement = connection.createStatement();
			statement.execute(query);
			System.out.println(connection);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}