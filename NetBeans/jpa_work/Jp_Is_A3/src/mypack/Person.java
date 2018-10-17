package mypack;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.DiscriminatorType; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Person2")
@SequenceGenerator(name="myGenerator",sequenceName="emp_seq")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="PersonType",discriminatorType=DiscriminatorType.INTEGER )
@DiscriminatorValue(value="1")
public class Person{
	@Id
	@GeneratedValue(generator="myGenerator",strategy=GenerationType.SEQUENCE )
	 int id;
     String name;

public Person(String name) {
	super();
	this.name = name;
}
public Person() {
	super();
	
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


}
