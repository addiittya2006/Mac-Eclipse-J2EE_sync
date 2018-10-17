<%@ taglib uri="/struts-tags" prefix="s" %>
<b> Welcome, <s:property value="user.name" /> <br>
You are registered, with following details: <br>
Street: <s:property value="user.address.street" /> <br>
City: <s:property value="user.address.city" /> <br>
State: <s:property value="user.address.state" /> <br> </b>