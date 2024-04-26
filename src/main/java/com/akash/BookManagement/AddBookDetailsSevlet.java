package com.akash.BookManagement;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/addBook")
public class AddBookDetailsSevlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession hs  = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired....<br>");
			RequestDispatcher rd = req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else
		{
		BookBean bb= new BookBean();
		bb.setbCode(req.getParameter("bcode"));
		bb.setbName(req.getParameter("bname"));
		bb.setbAuthor(req.getParameter("bauthor"));
		bb.setbPrice(Float.parseFloat(req.getParameter("bprice")));
		bb.setbQty(Integer.parseInt(req.getParameter("bqty")));
		
		int k = new AddBookDetailsDAO().insert(bb);
		if(k>0)
		{
			RequestDispatcher rd = req.getRequestDispatcher("AddBook.jsp");
			rd.forward(req, res);
		}
		}
	}

}
