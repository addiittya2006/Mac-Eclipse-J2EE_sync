package mypack;

import javax.persistence.DiscriminatorValue;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table ( name="Student")
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
