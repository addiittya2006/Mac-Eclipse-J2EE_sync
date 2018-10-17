<jsp:useBean id="user" class="mypack.UserBean" scope="application"/>

<b> following data is found in application scope... </b> <br>
Name: <jsp:getProperty name="user" property="name" /> <br>
Password: <jsp:getProperty name="user" property="password" /> <br>  
MailId: <jsp:getProperty name="user" property="mailId" /> <br>