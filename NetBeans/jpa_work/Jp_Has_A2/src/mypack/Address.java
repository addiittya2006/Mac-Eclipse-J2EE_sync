package mypack;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="sg",sequenceName="NextId")
@Table (name="Address4")
public class Address {
@Id
@GeneratedValue(generator="sg",strategy=GenerationType.SEQUENCE)
int id;
String city,state;
@OneToOne(mappedBy="address")
Person person;
//Annotate the property of owner object in owned entity using one to one annotation
//and specify the related owned entity using mappedBy attribute.
public Address() {
	super();
	
}
public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
}

