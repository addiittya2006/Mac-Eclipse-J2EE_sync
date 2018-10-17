<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="modelAction">
<s:textfield name="user.name" label="Name" />
<s:textfield name="street" label="Street" />
<s:textfield name="city" label="City" />
<s:textfield name="state" label="State" />
<s:submit value="Submit"/>
</s:form>
