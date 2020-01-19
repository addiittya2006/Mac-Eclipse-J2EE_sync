 <%@ taglib uri="/WEB-INF/taglib.tld" prefix="myLib" %>
  <br>   it  is  header 
   

       <br>    <myLib:hello name= '<%=request.getParameter("txtName")%>'  />


      
   <br>   It is  footer...


