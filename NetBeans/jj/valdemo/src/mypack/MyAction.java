package mypack;

import com.opensymphony.xwork2.*;

public class MyAction extends ActionSupport {
private String name,password;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public String execute()
{
	if (name.equals("neeraj")&& password.equals("kumar"))
		return "success";
	else
		return "error";
}

@Override
public void validate() {
	if (name.length()==0)
		//this.addFieldError("name", "Name can't be blank");
		this.addFieldError("name", getText("name.blank"));
		if (password.length()==0)
		//this.addFieldError("password", "password can't be blank");
			this.addFieldError("password", getText("password.blank"));
}

}
