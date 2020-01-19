package mypack;

public class MyAction {
String name;
public String execute()
{
try
{
Thread.sleep(20000);	
}catch(Exception e){}
return "success";
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
