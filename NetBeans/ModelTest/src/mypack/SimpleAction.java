package mypack;

public class SimpleAction {
User user;

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
