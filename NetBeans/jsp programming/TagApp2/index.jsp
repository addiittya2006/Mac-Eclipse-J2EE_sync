<%@ taglib uri="/WEB-INF/taglib.tld" prefix="myLib" %>

       <br> before  custom tag

      <myLib:myloop  counter="15">

                  <br>    <myLib:hello name='<%=request.getParameter("txtName")%>' />

         </myLib:myloop>

    <br>      after tag processing








