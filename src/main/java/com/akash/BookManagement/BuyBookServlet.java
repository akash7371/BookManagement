package com.akash.BookManagement;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/buyBook")
public class BuyBookServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else
		{
			ArrayList<BookBean> al = (ArrayList<BookBean>)hs.getAttribute("al");
			String bcode = req.getParameter("bcode");
			int qty = Integer.parseInt(req.getParameter("qty"));
			Iterator<BookBean> it = al.iterator();
			BookBean bb = null;
			while(it.hasNext())
			{
				bb = (BookBean)it.next();
				if(bcode.equals(bb.getbCode()))
				{
					bb.setbQty(bb.getbQty()-qty);
					break;
				}
			}
			int k = new BuyBookDAO().update(bb);
			if(k>0)
			{
				RequestDispatcher rd = req.getRequestDispatcher("CustomerBookUpdate.jsp");
				rd.forward(req, res);
			}
		}
	}
}
