<%@page import="mypack.*" %>
<%
EmpRemote remote=(EmpRemote)session.getAttribute("emp");
int id=Integer.parseInt(request.getParameter("id"));
remote.remove(id);
%>
<b>Successfully Deleted. </b> <br> <br>
<jsp:include page="index.jsp" />