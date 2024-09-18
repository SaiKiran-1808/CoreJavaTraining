package com.evergent.java.jdbc.application2;

import java.sql.*;

public class BookDB {
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evergentdb", "root", "admin");

		return conn;
	}

}
