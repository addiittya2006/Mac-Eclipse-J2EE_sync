package mypack;

import javax.persistence.*;
import java.util.*;

public class InsertTest {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Has_A6PU");
		EntityManager m=f.createEntityManager();
		Customer c1= new Customer ("Mohan",300000);
		Customer c2= new Customer ("Rohan",300000);
		
		Policy p1=new Policy( "jeevan",200000,c1);
		Policy p2=new Policy( "Yojna",200000,c2);
		Policy p3=new Policy( "jeev",200000,c1);
		Policy p4=new Policy( "Yoj",200000,c2);
		
		System.out.println("Persisting...");
		EntityTransaction t=m.getTransaction();
		t.begin();
		m.persist(p1);
		m.persist(p2);
		m.persist(p3);
		m.persist(p4);
   	    t.commit();
		m.close();
		System.out.println("Persisted.");

	}

}

