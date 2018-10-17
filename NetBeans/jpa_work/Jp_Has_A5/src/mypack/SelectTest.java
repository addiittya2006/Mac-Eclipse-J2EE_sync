package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;
public class SelectTest {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Has_A5PU");
		EntityManager m=f.createEntityManager();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a cust id");
		int pid= in.nextInt();
		Customer p1=m.find(Customer.class, pid);
		System.out.println( p1.getName()+"\t"+ p1.getAnnualIncome());
		System.out.println("details of policies .");
	  Set<Policy>  s1 =	p1.getPolicies();
	      for( Policy cur_obj : s1 )
	      {
	    	  System.out.println(cur_obj.getName()+ "\t"+ cur_obj.getSumassured());
	      }
	      
		m.close();
		f.close();
	}
}
