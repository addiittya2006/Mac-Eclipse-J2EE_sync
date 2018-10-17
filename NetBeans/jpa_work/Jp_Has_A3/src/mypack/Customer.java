package mypack;
import java.util.Set;
import javax.persistence.*;
@Entity
@SequenceGenerator(name="a",sequenceName="NextId")
public class Customer {
	@Id
	@GeneratedValue(generator="a",strategy=GenerationType.SEQUENCE)
	int id;
    String name;
    int annualIncome;
    // no error

    @OneToMany(cascade={CascadeType.ALL} )
@JoinColumn(name="CustomerId")
Set<Policy> policies;
public Customer() { super(); }
public Customer(String name,int annualIncome, Set<Policy> policies)
          { super();
            this.name=name;
            this.annualIncome =annualIncome;
            this.policies= policies;
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
