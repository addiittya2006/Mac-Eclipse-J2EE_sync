package mypack;

import javax.persistence.*;
import java.util.*;

public class InsertTest {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Has_A5PU");
		EntityManager m=f.createEntityManager();
		Set<Policy> set=new HashSet<Policy>();
		set.add( new Policy( "nirmal-jeevan",111111));
		set.add( new Policy( "bachpan",222222));
		
		Customer c= new Customer ("AMAN",300000,set);
		System.out.println("Persisting...");

		EntityTransaction t=m.getTransaction();
		t.begin();
		m.persist(c);
		t.commit();
		m.close();
		System.out.println("Persisted.");

	}

}

