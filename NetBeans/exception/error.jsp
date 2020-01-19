<%@ page isErrorPage="true" %>
<%
    if (exception instanceOf NumberFormatException)
{
  out.println("<b> number must be in integer"); 
}
else
{
    out.println("<b> second number must be non zero");
}

%>