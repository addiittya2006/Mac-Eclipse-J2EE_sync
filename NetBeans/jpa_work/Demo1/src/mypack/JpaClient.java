package mypack;
import java.util.List;

import javax.persistence.*;
public class JpaClient {

	
	public static void main(String[] args) {
try
{
System.out.println("Creating entity manager..");
EntityManagerFactory f=Persistence.createEntityManagerFactory("Demo1PU");
EntityManager m=f.createEntityManager();
Emp e=new Emp(101,"Amarrr","Train",12000);
 
System.out.println("persisting..");
EntityTransaction t=m.getTransaction();
   t.begin();
         m.persist(e);
  t.commit();

System.out.println("Entities persisted.");
}catch(Exception e)
{
System.out.println(e);	
}
}

}
