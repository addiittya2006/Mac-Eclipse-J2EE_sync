
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class myservlet extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("textname");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println(request.getMethod());
        for(int i=0;i<10;i++)
        {
            out.println("<br>welcome,"+name);
        }
            }

}

