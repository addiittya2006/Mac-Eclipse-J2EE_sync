package mypack;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="sg",sequenceName="NextId")
@Table (name="Person4")
public class Person {
@Id
@GeneratedValue(generator="sg",strategy=GenerationType.SEQUENCE)
int id;
String name;
@OneToOne(cascade={CascadeType.ALL})
@JoinColumn(name="addressId")
Address address;
public Person() {
	super();
}
public Person(String name, Address address) {
	super();
	this.name = name;
	this.address = address;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
