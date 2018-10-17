package com.addiittya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExcelServlet")
public class ExcelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("application/vnd.ms-excel");
            try (PrintWriter out = response.getWriter()) {
                out.println("Name \t Job \t Salary");
                out.println("1 \t kdsvbvb \t 45000");
                out.println("2 \t kdvshdbb \t 45900");
                out.println("3 \t kdskhvbb \t 45800");
                out.println("4 \t jhvsdvb \t 45090");
                out.println("\t Total \t =sum(c2:c4)");
                out.close();
            }
	}

}
