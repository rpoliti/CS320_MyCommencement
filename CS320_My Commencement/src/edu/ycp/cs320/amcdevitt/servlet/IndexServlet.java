package edu.ycp.cs320.amcdevitt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("In the Index servlet");
		
		req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if (req.getParameter("guess") != null) {
			System.out.println("reached");
			req.getRequestDispatcher("/_view/guessingGame.jsp").forward(req, resp);
		}
		if (req.getParameter("mul") != null) {
			req.getRequestDispatcher("/_view/multiplyNumbers.jsp").forward(req, resp);
		}
		if (req.getParameter("add") != null) {
			req.getRequestDispatcher("/_view/addNumbers.jsp").forward(req, resp);
		}
	
	
	}
}
