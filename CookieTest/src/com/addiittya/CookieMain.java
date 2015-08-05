package com.addiittya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieMain
 */
//@WebServlet("/CookieMain")
@SuppressWarnings("serial")
public class CookieMain extends HttpServlet {
//	private static final long serialVersionUID = 1L;
	private final String userID= "aditya";
	private final String password= "admin";
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
         
        if(user.equals(userID) && pwd.equals(password)){
            Cookie loginCookie = new Cookie("user",user);
            loginCookie.setMaxAge(30);
            response.addCookie(loginCookie);
            response.sendRedirect("LoggedIn.jsp");
        }else{
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.html");
            PrintWriter out= response.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(request, response);
        }
	}

}
