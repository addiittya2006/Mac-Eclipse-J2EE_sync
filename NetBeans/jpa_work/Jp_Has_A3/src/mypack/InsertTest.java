package mypack;
import javax.persistence.*;
import java.util.*;
public class InsertTest {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Has_A3PU");
		EntityManager m=f.createEntityManager();
		Set<Policy> set=new HashSet<Policy>();
		set.add( new Policy( "metlife11",20000));
		set.add( new Policy( "setlife11 ",50000));
		set.add( new Policy( "komal jeevan11",20000));
		set.add( new Policy( "pension policy11",50000));
		
		
		Customer c= new Customer ("Sahil Singh",300000,set);
		System.out.println("Persisting...");
		EntityTransaction t=m.getTransaction();
		t.begin();
		m.persist(c);
		t.commit();
		m.close();
		System.out.println("Persisted.");
	}
}

