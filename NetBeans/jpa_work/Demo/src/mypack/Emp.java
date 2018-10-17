package mypack;
import javax.persistence.Entity;
import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Id;
@Entity

public class Emp {
	@Id
		 int empId;
     String ename,job;
     int salary;
    
	public Emp() {}
	
	public Emp(int id,String ename, String job, int salary) {
		this.empId =id;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}

	public String toString()
	{
		return empId+"\t"+ename+"\t"+job+"\t"+salary;
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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

