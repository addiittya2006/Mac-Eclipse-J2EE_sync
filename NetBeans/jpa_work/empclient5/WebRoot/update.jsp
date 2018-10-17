<%@page import="mypack.*" %>
<%
EmpRemote remote=(EmpRemote)session.getAttribute("emp");
int id=Integer.parseInt(request.getParameter("id"));
Emp e=remote.getById(id);
%>
<form action="updateEmp.jsp" >
Name <input type="text" name="name" value="<%=e.getName() %>"> <br>
Job <input type="text" name="job" value="<%=e.getJob() %>"> <br>
Salary <input type="text" name="salary" value="<%=e.getSalary() %>"> <br>
<input type="hidden" name="id" value="<%=e.getId() %>"> <br>
<input  type="submit" value="update" >
</form>



