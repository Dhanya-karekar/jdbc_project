package com.xworkz.jdbcproject;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class TechnologyTester {

		public static void main(String[] args) {
			String username = "root";
			String password = "4PM15IS@011";
   			String fqnOdDriverImpl = "com.mysql.cj.jdbc.Driver";
   			String url = "jdbc:mysql://127.0.0.1:3306/project";
			Connection connection = null;

			try {
				Class.forName(fqnOdDriverImpl);
				connection = DriverManager.getConnection(url, username, password);

				String query = "insert into technology_table values(11,'Java',25000.00,6)";
				String query1 = "insert into technology_table values(22,'artificial intelligence',35000.00,2)";
				String query2 = "insert into technology_table values(33,'C++',20000.00,3)";
				String query3 = "insert into technology_table values(44,'Python',5000.00,4)";
				String query4 = "insert into technology_table values(55,'Machine learning',12000.00,7)";

				Statement statement = connection.createStatement();

				statement.execute(query);
				statement.execute(query1);
				statement.execute(query2);
				statement.execute(query3);
				statement.execute(query4);

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
