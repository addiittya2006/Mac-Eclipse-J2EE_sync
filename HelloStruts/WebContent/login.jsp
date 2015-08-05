<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Hello Struts</title>
</head>
<body>

<s:form action="Welcome">
	<s:textfield name="username" label="User"/>
	<s:submit/>
</s:form>

</body>
</html>