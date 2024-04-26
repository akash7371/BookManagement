package com.akash.BookManagement;
import java.sql.*;
public class DBConnection {
	public static Connection con;
	
	private DBConnection() {}
	static
	{
		try
		{
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.url,DBInfo.username,DBInfo.password);
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	public static Connection getCon()
	{
		return con;
	}
}
