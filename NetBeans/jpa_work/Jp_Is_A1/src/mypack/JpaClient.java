package mypack;
import javax.persistence.*;
public class JpaClient {
	public static void main(String[] args) {
try
{
System.out.println("Creating entity manager..");
EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Is_A1PU");
EntityManager m=f.createEntityManager();
EntityTransaction t=m.getTransaction();
t.begin();
Person p=new Person("varun");
Emp e=new Emp("mahesh","clerk",30000);
Student s=new Student("tarun","c++",9000);
m.persist(p);
m.persist(e);
m.persist(s);
t.commit();
System.out.println("Entities persisted.");
}catch(Exception e)
{
  System.out.println(e);	
}
}
}
