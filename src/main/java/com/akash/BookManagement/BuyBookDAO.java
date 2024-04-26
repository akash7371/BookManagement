package com.akash.BookManagement;
import java.sql.*;

public class BuyBookDAO {

	public int k=0;
	
	public int update(BookBean bb)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("update bookdetails56 set qty=? where bcode=?");
			ps.setInt(1, bb.getbQty());
			ps.setString(2, bb.getbCode());
			k = ps.executeUpdate();
			
		}
		catch(Exception e) {e.printStackTrace();}
		return k;
	}
}
