<jsp:useBean id="user" class="mypack.UserBean" scope="application"/>

<jsp:setProperty name="user" property="*" />


<b> User data is set in application scope... </b> <br>

    <%     if ( user.register() )
                   {
                        out.println("  successfully created");
                   }
               else
                  {
                      out.println(" unable to  create new user...");
                  }
        %>

<a href="view.jsp">view data </a>
