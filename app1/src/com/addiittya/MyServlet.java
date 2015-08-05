package com.addiittya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletContext obj = getServletContext();
		System.out.println(obj);
		PrintWriter out = response.getWriter();
		
		ServletContext obj2 = obj.getContext("/app2");
		System.out.println(obj2);
		RequestDispatcher rd = obj2.getRequestDispatcher("/yours");
		
		System.out.println("Servlet 1 of App1");
		out.println("Servlet 1 of App1");
	
		rd.include(request, response);
		out.close();
	}

}
