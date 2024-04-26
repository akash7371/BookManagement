package com.akash.BookManagement;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
public class CustomerLoginDAO {

	public CustomerBean cb =null;
	
	public CustomerBean login(HttpServletRequest req)
	{
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from customerdetails56 where uname=? and pword=?");
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pass"));
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				cb = new CustomerBean();
				cb.setuName(rs.getString(1));
				cb.setpWord(rs.getString(2));
				cb.setfName(rs.getString(3));
				cb.setCity(rs.getString(4));
				cb.setState(rs.getString(5));
				cb.setpCode(rs.getInt(6));
				cb.setmId(rs.getString(7));
				cb.setPhno(rs.getLong(8));
				
			}
		}
		catch(Exception e) {e.printStackTrace();}
		return cb;
		
	}
}
