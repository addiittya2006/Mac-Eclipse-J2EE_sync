<%@ page import="java.util.*" %>

<b> following init parameters are defined for this jsp...</b><br>

<%
Enumeration e=config.getInitParameterNames();
while(e.hasMoreElements())
{
String pname=(String) e.nextElement();
String value=config.getInitParameter(pname);
out.println(pname+"\t"+value+"<br>");
}
%>