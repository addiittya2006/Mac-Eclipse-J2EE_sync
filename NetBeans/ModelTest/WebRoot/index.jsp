<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="simple">
<s:textfield name="user.name" label="Name" />
<s:textfield name="user.address.street" label="Street" />
<s:textfield name="user.address.city" label="City" />
<s:textfield name="user.address.state" label="State" />
<s:submit value="Submit"/>
</s:form>
