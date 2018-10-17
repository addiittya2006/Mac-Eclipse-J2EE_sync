<%@ page import="mypack.*,javax.naming.*" %>
<%
InitialContext ctx=new InitialContext();
Account account=(Account)ctx.lookup("myAccount");
session.setAttribute("account",account);
int amt=Integer.parseInt(request.getParameter("txtAmount"));
account.deposit(amt);
%>
<b> Your A/C is successfully opened. </b> <br>
<jsp:include page="operations.html" />