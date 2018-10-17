<%@page import="javax.naming.*,mypack.*" %>
<jsp:useBean id="emp" class="mypack.Emp" />
<jsp:setProperty name="emp" property="*" />
<%
EmpRemote remote=(EmpRemote)session.getAttribute("emp");
if (remote==null)
{
InitialContext ctx=new InitialContext();
remote=(EmpRemote)ctx.lookup("empFacade5");
session.setAttribute("emp",remote);
}
remote.save(emp);
%>
<b> Emp Successfully added. </b> <br>
<jsp:include page="index.jsp" />



