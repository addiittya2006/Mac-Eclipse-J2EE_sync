package mypack;

public class User {
String name;
Address address;

public User() // for Model Action
{
	address=new Address();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
