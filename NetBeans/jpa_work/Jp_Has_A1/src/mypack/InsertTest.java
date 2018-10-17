
package mypack;
import javax.persistence.*;
public class InsertTest {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Has_A1PU");
		EntityManager m=f.createEntityManager();
		Address a=new Address("virnda","UP");
		Person p1=new Person("amarpal",a);
		System.out.println("persisting persons...");
		EntityTransaction t=m.getTransaction();
		t.begin();
		m.persist(p1);
		t.commit();
		m.close();
		f.close();
		System.out.println("Persisted.");
	}
}


           








