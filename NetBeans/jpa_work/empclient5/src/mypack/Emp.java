package mypack;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name="emp3")
@SequenceGenerator(name="gen",sequenceName="mysequence")
public class Emp implements Serializable {
@Id
@GeneratedValue(generator="gen",strategy=GenerationType.SEQUENCE)
private int id;
String name,job;
int salary;

public Emp() {
	super();
	
}
public Emp(String name, String job, int salary) {
	super();
	this.name = name;
	this.job = job;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
