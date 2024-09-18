package com.evergent.corejava.studentapplicationdao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	
	public static Connection getConnection() throws Exception {
		String url = "jdbc:mysql://localhost:3306/evergentdb";
		String name = "root";
		String pass = "admin";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,name,pass);
		
		return con;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

	}

}
