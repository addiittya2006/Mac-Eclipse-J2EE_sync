package com.addiittya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/MyServlet")
@SuppressWarnings("serial")
public class MyServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		 ServletContext ctx = request.getServletContext();
         ctx.setAttribute("User", "Aditya");
         String user = (String) ctx.getAttribute("User");
         ctx.removeAttribute("User");
          
         HttpSession session = request.getSession();
         session.invalidate();
          
         PrintWriter out = response.getWriter();
         out.write("Hi "+user);
	}

}
