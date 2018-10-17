

  <%
           int  x   =  Integer.parseInt(  request.getParameter( "txtFirst") );
           int  y   =  Integer.parseInt(  request.getParameter( "txtSecond") );
             int  z    =  x   +   y ;

               out.print("<br>  output from first   jsp file...   "  +   z  );
          %>

            <jsp:include page="multi.jsp" />    

          <!--  <jsp:forward page="multi.jsp" />    -->


      <%
               out.print("<br>  back on first  jsp file " );
    %>



   








