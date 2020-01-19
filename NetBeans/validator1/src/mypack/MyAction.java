package mypack;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport{
private String name,password,mailId;
private String dob;
private int exp;
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}
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
public String getMailId() {
	return mailId;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String execute()
{
	return "success";
}
}
