package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfig {

	
	private static String jdbcUrl="jdbc:postgresql://localhost:5432/Tea";
	private static String  jdbcUsername ="postgres";
	private static String jdbcPassword = "2333";
	
	public static Connection getConnection() {
	Connection connection = null;
	
try {
	
	connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
}catch(SQLException e) {
	e.printStackTrace();
}
return connection;
	}
}
