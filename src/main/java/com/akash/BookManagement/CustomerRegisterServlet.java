package com.akash.BookManagement;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class CustomerRegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		int k = new CustomerRegisterDAO().insert(req);
		if(k>0)
		{
			RequestDispatcher rd = req.getRequestDispatcher("CustomerRegister.jsp");
			rd.forward(req, res);
		}
	}
}
