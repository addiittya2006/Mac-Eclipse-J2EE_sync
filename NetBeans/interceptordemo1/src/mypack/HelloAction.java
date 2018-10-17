package mypack;
public class HelloAction {
private String name;
private String actionStatus;

public HelloAction() {
	actionStatus="Action isn't invoked.";
}
public String execute()
{
	actionStatus="Action is invoked.";
return "success";	
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String getActionStatus() {
	return actionStatus;
}

}





