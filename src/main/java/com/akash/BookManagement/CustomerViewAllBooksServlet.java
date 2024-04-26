package com.akash.BookManagement;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/cview")
public class CustomerViewAllBooksServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else
		{
			ArrayList<BookBean> al = new ViewAllBookDetailsDAO().retrieve();
			hs.setAttribute("al", al);
			RequestDispatcher rd = req.getRequestDispatcher("CustomerViewBooks.jsp");
			rd.forward(req, res);
		}
	}

	

}
