package com.akash.BookManagement;
import java.sql.*;

public class UpdateBookDetailsDAO {
	private int k=0;
	
	public int update(BookBean bb)
	{
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("update bookdetails56 set bprice=?, qty=? where bcode=?");
			ps.setFloat(1,bb.getbPrice());
			ps.setInt(2, bb.getbQty());
			ps.setString(3, bb.getbCode());
			k=ps.executeUpdate();
		}
		catch(Exception e) {e.printStackTrace();}
		return k;
	}
}
