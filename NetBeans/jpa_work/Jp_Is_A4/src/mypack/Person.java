package mypack;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Person3")
@SequenceGenerator(name="myGenerator",sequenceName="srno")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS )
public class Person{
	@Id
	@GeneratedValue(generator="myGenerator",strategy=GenerationType.SEQUENCE )
	 int id;
     String name;
public Person(String name) {
	super();
	this.name = name;
	
}
public Person() {
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


}
