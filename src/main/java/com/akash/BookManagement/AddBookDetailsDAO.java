package com.akash.BookManagement;
import java.sql.*;

public class AddBookDetailsDAO {
	public int k=0;
	public int insert(BookBean bb)
	{
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into bookDetails56 values(?,?,?,?,?)");
			ps.setString(1, bb.getbCode());
			ps.setString(2, bb.getbName());
			ps.setString(3, bb.getbAuthor());
			ps.setFloat(4, bb.getbPrice());
			ps.setInt(5, bb.getbQty());
			k = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return k;
	}
}
