package com.evergent.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class LibraryDBConnection {


	// TODO Auto-generated method stub
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/evergentdb", "root", "admin");
	}
	public static void main(String[] args) {
}

}
