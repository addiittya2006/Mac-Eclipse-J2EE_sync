package mypack;
import java.util.Set;
import javax.persistence.*;
@Entity
@SequenceGenerator(name="a",sequenceName="NextId")
@Table(name="customer2")
public class Customer {
	@Id
	@GeneratedValue(generator="a",strategy=GenerationType.SEQUENCE)
	int id;
    String name;
    int annualIncome;
@OneToMany(mappedBy="customer")   
                                        // here  "customer" is the name of  ref. var.  included in  owned entity
Set<Policy> policies;
public Customer() { super(); }
public Customer(String name,int annualIncome)
          { super();
            this.name=name;
            this.annualIncome =annualIncome;
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
public int getAnnualIncome() {
	return annualIncome;
}
public void setAnnualIncome(int annualIncome) {
	this.annualIncome = annualIncome;
}
public Set<Policy> getPolicies() {
	return policies;
}
public void setPolicies(Set<Policy> policies) {
	this.policies = policies;
}



}
