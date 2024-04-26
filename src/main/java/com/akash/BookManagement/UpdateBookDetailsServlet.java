package com.akash.BookManagement;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateBookDetailsServlet extends HttpServlet {

	@SuppressWarnings("unchecked")
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}else {
			String code = req.getParameter("bcode");
			ArrayList<BookBean> al = (ArrayList<BookBean>)hs.getAttribute("al");
			Iterator<BookBean> it = al.iterator();
			BookBean bb = null;
			while(it.hasNext())
			{
				bb = it.next();
				if(code.equals(bb.getbCode()))
				{
					bb.setbPrice(Float.parseFloat(req.getParameter("bprice")));
					bb.setbQty(Integer.parseInt(req.getParameter("bqty")));
					break;
				}
			}
			int k = new UpdateBookDetailsDAO().update(bb);
			if(k>0)
			{
				RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");
				rd.forward(req, res);
			}
		}
		
	}
}
