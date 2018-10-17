<%@ taglib prefix="s" uri="/struts-tags" %>
<s:head/>
<s:form action="validatordemo" >
<s:textfield name="name" label="Name" />
<s:password name="password" label="Password" />
<s:textfield name="mailId" label="Email" />
<s:textfield name="dob" label="Date Of Birth" />
<s:textfield name="exp" label="Exp in Yrs." />
<s:submit />
</s:form>