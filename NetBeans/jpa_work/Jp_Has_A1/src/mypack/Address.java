package mypack;
import javax.persistence.*;
@Entity
@SequenceGenerator(name="sg",sequenceName="NextId")
@Table (name="Address4")
public class Address {
@Id
@GeneratedValue(generator="sg",strategy=GenerationType.SEQUENCE)
int id;   // primary key of  owned entity  will act as foreign key in owner entity
String city,state;
public Address() {
}
public Address(String city, String state) {

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
}

