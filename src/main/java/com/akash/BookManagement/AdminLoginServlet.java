package com.akash.BookManagement;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/alog")
public class AdminLoginServlet extends HttpServlet {

	@Override
	protected void  doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		AdminBean ab = new AdminLoginDAO().login(req);
		if(ab==null)
		{
			req.setAttribute("msg", "Invalid login credential....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else
		{
			HttpSession hs = req.getSession(); //New Session created
			hs.setAttribute("abean", ab); //adding admin bean to session
			RequestDispatcher rd = req.getRequestDispatcher("AdminLogin.jsp");
			rd.forward(req, res);
						
		}
	}
}
