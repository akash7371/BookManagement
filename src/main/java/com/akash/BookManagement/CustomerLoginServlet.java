package com.akash.BookManagement;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/clog")
public class CustomerLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		CustomerBean cb = new CustomerLoginDAO().login(req);
		if(cb==null)
		{
			req.setAttribute("msg", "Invalid login credential....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else
		{
			HttpSession hs = req.getSession();
			hs.setAttribute("cbean", cb);
			RequestDispatcher rd = req.getRequestDispatcher("CustomerLogin.jsp");
			rd.forward(req, res);
		}
		
		
	}
}
