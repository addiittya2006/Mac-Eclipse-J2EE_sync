package mypack;
import java.util.Set;
import javax.persistence.*;
@Entity
@SequenceGenerator(name="a",sequenceName="NextId")
public class Previlige1 {
	@Id
	@GeneratedValue(generator="a",strategy=GenerationType.SEQUENCE)
	int id;
 String name;
	@ManyToMany(mappedBy="previleges")
	Set<Emp4> employees;
	public  Previlige1(String name) {
		super();
		this.name = name;
	}
	public Previlige1() {
		super();
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
	public Set<Emp4> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Emp4> employees) {
		this.employees = employees;
	}
 public String toString()
 { return( "  "+name);}
	}

	
	

