package com.akash.BookManagement;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;

public class CustomerRegisterDAO {

	public int k=0;
	
	public int insert(HttpServletRequest req)
	{
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into customerdetails56 values(?,?,?,?,?,?,?,?)");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pass"));
			ps.setString(3, req.getParameter("name"));
			ps.setString(4, req.getParameter("city"));
			ps.setString(5, req.getParameter("state"));
			ps.setInt(6, Integer.parseInt(req.getParameter("pcode")));
			ps.setString(7, req.getParameter("mid"));
			ps.setLong(8, Long.parseLong(req.getParameter("phno")));
			k = ps.executeUpdate();
		}
		catch(Exception e) {e.printStackTrace();}
		return k;
	}
}
