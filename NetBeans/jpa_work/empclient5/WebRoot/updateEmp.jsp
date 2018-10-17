<%@page import="mypack.*" %>
<jsp:useBean id="emp" class="mypack.Emp" />
<jsp:setProperty name="emp" property="*" />
<%
EmpRemote remote=(EmpRemote)session.getAttribute("emp");
remote.update(emp);
%>
<b> Successfully updated. </b> <br>
<jsp:include page="index.jsp" />