package com.addiittya;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TransacServ
 */
//@WebServlet("/TransacServ")
public class TransacServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	Connection conn = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		try {
			String source = request.getParameter("src");
			String target = request.getParameter("tar");
			String amount = request.getParameter("amt");

			response.setContentType("text/html");
			
			ServletContext ctx=getServletContext();

			Class.forName(ctx.getInitParameter("jdbc_driver"));
			Connection conn=DriverManager.getConnection(ctx.getInitParameter("jdbc_url"),ctx.getInitParameter("jdbc_user"),ctx.getInitParameter("jdbc_pass"));

			PreparedStatement stmt1 = conn.prepareStatement("update account set balance = balance+? where name = ?");
			PreparedStatement stmt2 = conn.prepareStatement("update account set balance = balance-? where name = ?");

			stmt1.setInt(1, Integer.parseInt(amount));
			stmt2.setInt(1, Integer.parseInt(amount));
			stmt1.setString(2, target);
			stmt2.setString(2, source);

			conn.setAutoCommit(false);

			int j = stmt1.executeUpdate();
			int l = stmt2.executeUpdate();
			conn.commit();

			if(j==1 && l==1)
				out.println("<center>Transaction Successful!<br/><br/></center>");
			
			PreparedStatement stmt3=conn.prepareStatement("select * from account where name = ?");
			PreparedStatement stmt4=conn.prepareStatement("select * from account where name = ?");
			
			stmt3.setString(1, source);
			stmt4.setString(1, target);
			
			ResultSet rs1 = stmt3.executeQuery();
			ResultSet rs2 = stmt4.executeQuery();
			conn.commit();

			out.println("name\t"+"accno\t"+"balance"+"<br/>");
			while(rs1.next()){
				out.println(rs1.getString("name")+"\t"+rs1.getString("accno")+"\t"+rs1.getInt("balance")+"<br/>");
			}
			while(rs2.next()){
				out.println(rs2.getString("name")+"\t"+rs2.getString("accno")+"\t"+rs2.getInt("balance")+"<br/>");
			}
			
			rs1.close();
			rs2.close();
			conn.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e){
			out.println("Transaction Failed");
			e.printStackTrace();
			try{
				out.println("Transaction Rolling Back");
				conn.rollback();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
	}

}