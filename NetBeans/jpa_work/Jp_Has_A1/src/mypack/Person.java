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
// represent column name of Person Table with which we
//  wants to perform  join
// Note :  write column name in caseSenstive manner
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



//@SequenceGenerator(name="sg",sequenceName="NextId")
//@GeneratedValue(generator="sg",strategy=GenerationType.SEQUENCE)
