package com.addiittya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException
	{
		System.out.println("Starting Servlet...");
		String name=request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Welcome, "+name+"<br/>");
		System.out.println("Exiting Servlet...");
		out.close();
	}
}