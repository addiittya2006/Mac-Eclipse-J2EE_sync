

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExcelServlet
 */
//@WebServlet("/ExcelServlet")
public class ExcelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		PrintWriter out = response.getWriter();
		out.println("Name\tJob\tSalary");
		out.println("1\tkdsvbvb\t45000");
		out.println("2\tkdvshdbb\t45900");
		out.println("3\tkdskhvbb\t45800");
		out.println("4\tjhvsdvb\t45090");
		out.println("\tTotal\t=sum(c2:c4)");
		out.close();
	}

}
