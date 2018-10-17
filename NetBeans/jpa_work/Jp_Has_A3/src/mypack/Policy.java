package mypack;
import javax.persistence.*;
@Entity
@SequenceGenerator(name="a",sequenceName="NextId")
@Table(name="Customer_Policy")
public class Policy {
	@Id
	@GeneratedValue(generator="a",strategy=GenerationType.SEQUENCE)
	int id;
	String name;
	int sumassured;
	public Policy() { super();}
	public Policy(String nm,int sumassured)
	{  
		super();
		this.name=nm;
		this.sumassured =sumassured;
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
	
	
}
