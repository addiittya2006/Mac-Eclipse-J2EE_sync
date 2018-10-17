package mypack;
import javax.persistence.*;
@Entity
@SequenceGenerator(name="a",sequenceName="NextId")
@Table(name="policy2")
public class Policy {
	@Id
	@GeneratedValue(generator="a",strategy=GenerationType.SEQUENCE)
	int id;
	String name;
	int sumassured;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerId") // here  customerId the name of the field present in policy2 Table
	Customer customer;
	public Policy() { super();}
	public Policy(String nm,int sumassured,Customer c)
	{  
		super();
		this.name=nm;
		this.sumassured =sumassured;
		customer=c;
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
	public int getSumassured() {
		return sumassured;
	}
	public void setSumassured(int sumassured) {
		this.sumassured = sumassured;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
