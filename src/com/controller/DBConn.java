package com.controller;

import java.sql.*;

public class DBConn {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/print_o_mania";
	static final String USERNAME = "root";
	static final String PASSWORD = "root";
	static Connection conn = null;
	public static Connection getConnection(){
		if(conn!=null){
			return conn;
		}
		else{
			try{
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			return conn;
		}
	}
}
