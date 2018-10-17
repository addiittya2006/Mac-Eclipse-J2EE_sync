package mypack;
import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="3")
public class Student extends Person {
 String course;
 int fee;
public Student() {
	super();
	}
public Student(String name, String c,int f) {
	super(name);
	course=c;
	fee=f;
}
public Student(int id,String name, String c,int f) {
	super(id,name);
	course=c;
	fee=f;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
}
