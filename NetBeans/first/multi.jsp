

  <%
           int  x   =  Integer.parseInt(  request.getParameter( "txtFirst") );
           int  y   =  Integer.parseInt(  request.getParameter( "txtSecond") );
             int  z    =  x   *   y ;

               out.print("<br>  output from seocnd   jsp file...   "  +   z  );
          %>

            <%@ include  file="index.html"    %>




   








