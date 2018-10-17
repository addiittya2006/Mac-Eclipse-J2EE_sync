package mypack;

import javax.persistence.*;
import java.util.*;

public class InsertTest {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Has_A7PU");
		EntityManager m=f.createEntityManager();
		Previlige1 p1=new Previlige1("Caar");
		Previlige1 p2=new Previlige1("Flaat");
		Previlige1 p3=new Previlige1("Toour");
		Set<Previlige1> s1=new HashSet<Previlige1>();
		Set<Previlige1> s2=new HashSet<Previlige1>();
		Set<Previlige1> s3=new HashSet<Previlige1>();
		s1.add(p1);
		s1.add(p2);
		s1.add(p3);
		s2.add(p1);
		s2.add(p2);
		s3.add(p1);
		Emp4 e1=new Emp4("Abhi",s1);
		Emp4 e2=new Emp4("Mishu",s2);
		Emp4 e3=new Emp4("Sahil",s3);
		System.out.println("persisting Emp4...");
		EntityTransaction t=m.getTransaction();
		t.begin();
		m.persist(e1);
		m.persist(e2);
		m.persist(e3);
		t.commit();
		m.close();
		f.close();
		System.out.println("Persisted.");

	}

}
