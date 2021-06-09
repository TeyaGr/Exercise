package com.example.pojoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConfig {

	
	private static String jdbcURL="jdbc:postgresql://localhost:5432/demo";
	private static String jdbcUsername= "postgres";
	private static String jdbcPassword="2333";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
			Statement statement = connection.createStatement();
			}
	catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

}
