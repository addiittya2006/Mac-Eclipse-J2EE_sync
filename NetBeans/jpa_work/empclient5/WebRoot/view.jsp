<%@page import="javax.naming.*,mypack.*,java.util.*" %>
<%
EmpRemote remote=(EmpRemote)session.getAttribute("emp");
if (remote==null)
{
InitialContext ctx=new InitialContext();
remote=(EmpRemote)ctx.lookup("empFacade5");
session.setAttribute("emp",remote);
}
String opr=request.getParameter("operation");
if (opr.equals("all"))
{
List<Emp> list=remote.getAllEmp();
Iterator<Emp> itr=list.iterator();
out.println("<table width=100%  border=1 bgcolor=#c0c0c0>");
out.println("<tr><td>Name</td><td>Job</td><td>Salary</td><td>Action 1"+"</td><td>Action 2</td> </tr>");
while(itr.hasNext())
{
Emp e=itr.next();
String url1="<a href=update.jsp?id="+e.getId()+">update</a>";
String url2="<a href=delete.jsp?id="+e.getId()+">delete</a>";
out.println("<tr><td>"+e.getName()+"</td><td>"+e.getJob()+"</td><td>"+
e.getSalary()+"</td><td>"+url1+"</td><td>"+url2+"</td></tr>");
}
out.println("</table>");
}
else
{
int id=Integer.parseInt(request.getParameter("id"));
Emp e=remote.getById(id);
String url1="<a href=update.jsp?id="+e.getId()+">update</a>";
String url2="<a href=delete.jsp?id="+e.getId()+">delete</a>";
out.println("<table width=100%  border=1 bgcolor=#c0c0c0>");
out.println("<tr><td>Name</td><td>Job</td><td>Salary</td><td>Action 1"
+"</td><td>Action 2</td></tr>");
out.println("<tr><td>"+e.getName()+"</td><td>"+e.getJob()+"</td><td>"
+e.getSalary()+"</td><td>"+url1+"</td><td>"+url2+"</td></tr>");
out.println("</table>");
}
%>



