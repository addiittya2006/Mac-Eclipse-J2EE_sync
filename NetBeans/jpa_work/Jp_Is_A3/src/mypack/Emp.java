package mypack;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity 
@Table ( name="Emp2")
@DiscriminatorValue(value="2")
public class Emp extends Person{
	 String job;
     int salary;
    
	public Emp() {}
	
	public Emp( String name,String job, int salary) {
		super(name);
		this.job = job;
		this.salary = salary;
	}

	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    
}
