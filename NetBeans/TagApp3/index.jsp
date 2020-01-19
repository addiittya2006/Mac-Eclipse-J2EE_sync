<%@ taglib uri="/WEB-INF/taglib.tld" prefix="myLib" %>

<br>  before tag processing


<br>    <myLib:hello name='<%=request.getParameter("txtName")%>' />


  <br>  after tag  processing

<br>    <myLib:hello name="directvalue" />




