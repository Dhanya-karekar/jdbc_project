package com.xworkz.jdbc.scam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ScamDeleteByIdTester {

	public static void main(String[] args) {

		String username = "root";
		String password = "4PM15IS@011";
		String url = "jdbc:mysql://127.0.0.1:3306/project";

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			Statement statement = connection.createStatement();
			String query = "DELETE FROM scam WHERE s_id = 20";
			statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
