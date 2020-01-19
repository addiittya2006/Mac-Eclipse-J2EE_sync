<%@ page errorPage="error.jsp" %>
<%
    try
       {
        int n= Integer.parseInt(request.getParameter(txtname1));

         int w=Integer.parseInt(request.getParameter(txtname2));

          int z=n/w;
        }catch(NumberFormatException e)
           {
                   out.println("plz insert only numeric number");
             }
%>

