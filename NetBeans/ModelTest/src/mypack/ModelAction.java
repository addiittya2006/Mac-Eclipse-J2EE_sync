package mypack;

import com.opensymphony.xwork2.ModelDriven;

public class ModelAction implements ModelDriven  <Address> {
User user;
	
	public Address getModel() {
		user=new User();
		return user.getAddress();
	}

	public String execute()
	{
		return "success";
		
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
