package mypack;
import java.util.Set;
import javax.persistence.*;
@Entity
@SequenceGenerator(name="a",sequenceName="NextId")
public class Emp4 {
	@Id
	@GeneratedValue(generator="a",strategy=GenerationType.SEQUENCE)
	int id;
String name;
@ManyToMany(cascade={CascadeType.ALL})
@JoinTable(name="emp_previlige",joinColumns={@JoinColumn(name="empid")},inverseJoinColumns={@JoinColumn(name="previligeid")})
Set<Previlige1> previleges;
public Emp4(String name, Set<Previlige1> previleges) {
	super();
	this.name = name;
	this.previleges = previleges;
}
public Emp4() {
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
public Set<Previlige1> getPrevileges() {
	return previleges;
}
public void setPrevileges(Set<Previlige1> previleges) {
	this.previleges = previleges;
}
public String toString()
{ return (name);}
}

