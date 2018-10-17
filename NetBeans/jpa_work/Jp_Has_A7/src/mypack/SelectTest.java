package mypack;
import java.util.*;
import javax.persistence.*;

public class SelectTest {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Has_A7PU");
		EntityManager m=f.createEntityManager();
		System.out.print("Enter emp id");
		Scanner cin = new Scanner(System.in);
		int eid = cin.nextInt();
		System.out.println("fetching Emp having id " + eid);
		Emp4 e1=m.find(Emp4.class, eid);
		System.out.println("Emp Name: "+e1.getName());
		System.out.println("following previleges are enjoyed by him");
		Set<Previlige1> p=e1.getPrevileges();
		System.out.println( p );
		System.out.println("--------------");
		Iterator <Previlige1> itr=p.iterator();
		while(itr.hasNext())
		{
			Previlige1 pr=itr.next();
			System.out.println(pr.getName());
		}
		
		System.out.print("Enter Previlege id");
		int pid = cin.nextInt();
		System.out.println("fetching Previlege having id " + pid );
		Previlige1 pr1=m.find(Previlige1.class, pid);
		System.out.println("Previlege Name: "+pr1.getName());
		System.out.println("It is provided to following emps...");
		Set<Emp4> s=pr1.getEmployees();
		System.out.println( s);
		System.out.println("--------------");
				Iterator <Emp4> eitr=s.iterator();
		while(eitr.hasNext())
		{
			Emp4 emp=eitr.next();
			System.out.println(emp.getName());
		}
		m.close();
		f.close();
		
	}
}
