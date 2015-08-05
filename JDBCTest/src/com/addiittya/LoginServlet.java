package com.addiittya;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
		try{
			String id=request.getParameter("uid");
			String pass=request.getParameter("passw");

			response.setContentType("text/html");
			PrintWriter out=response.getWriter();

			ServletContext ctx=getServletContext();

			Class.forName(ctx.getInitParameter("jdbc_driver"));
			Connection conn=DriverManager.getConnection(ctx.getInitParameter("jdbc_url"),ctx.getInitParameter("jdbc_user"),ctx.getInitParameter("jdbc_pass"));

			PreparedStatement stmt=conn.prepareStatement("select * from employees where id=? and password=?");
			stmt.setInt(1,Integer.parseInt(id));
			stmt.setString(2,pass);
			ResultSet rset=stmt.executeQuery();
			if (rset.next())
			{
				request.setAttribute("role",rset.getString("role"));
				request.setAttribute("first",rset.getString("first"));
				request.setAttribute("last",rset.getString("last"));
				RequestDispatcher rd=request.getRequestDispatcher("welcome");
				rd.forward(request,response);
				out.println(" <br/> Back on Login" );
				//When will the above statement get printed
				//will it be printed when we forward the request to
				//login page again ????
				System.out.println("from login...");
			}
			else
			{
				out.println("<center>Invalid name or password!<br/></center>");
				RequestDispatcher rd=request.getRequestDispatcher("index.html");
				rd.include(request,response);
			}
			out.close();
			conn.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}
}
