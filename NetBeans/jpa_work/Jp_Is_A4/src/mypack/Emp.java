package mypack;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table ( name="Emp3")
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
