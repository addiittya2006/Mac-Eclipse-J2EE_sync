package mypack;

public class SimpleAction {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public String execute()
{
    System.out.println("from action...");
return "success";	
}
}
