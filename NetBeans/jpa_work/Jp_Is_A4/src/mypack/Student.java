package mypack;
import javax.persistence.Entity;

import javax.persistence.Table;
@Entity
@Table ( name="Student")

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
