package mypack;

public class SimpleAction 
{
	
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
public String abc()
{
    System.out.println("in abc");
	if (name.equals("gyan")&& password.equals("tech"))
		return "success";
	else
		return "error";
}
}
