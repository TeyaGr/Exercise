package com.example.db;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

	
	private static String createTableStatement = "CREATE TABLE public.user(\r\n" + 
			"user_id INT primary key,\r\n" + 
			"name VARCHAR(20),\r\n" + 
			"email VARCHAR (40),\r\n" + 
			"country VARCHAR(30),\r\n" + 
			"password VARCHAR(10)\r\n" + 
			");"; 
	private static String newTable="CREATE TABLE public.student(\r\n" + 
			"student_id INT primary key,\r\n" + 
			"name VARCHAR(20),\r\n" + 
			"lastname VARCHAR (40),\r\n" + 
			"major VARCHAR(30),\r\n" + 
			");";
		public static void main(String[] args) {
			CreateTable createTable = new CreateTable();
			createTable.createTable();
		}
	public void createTable() {
		
		try {
			//step 1 = create connection
			Connection connection = JDBCConfig.getConnection();
			//step 2 = create statement
			Statement statement = connection.createStatement();
			//step 3 = execute statement
			statement.execute(createTableStatement);
			statement.execute(newTable);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
