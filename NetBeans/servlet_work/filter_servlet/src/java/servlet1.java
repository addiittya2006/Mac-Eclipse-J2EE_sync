
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Servlet invoked, processing request...");
String name=request.getParameter("txtName");
response.setContentType("text/html");
PrintWriter out=response.getWriter();
out.println("Welcome, "+name);
System.out.println("processing completed in servlet...");

     }


}
