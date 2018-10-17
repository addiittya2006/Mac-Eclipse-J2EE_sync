package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;
public class SelectTest {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Has_A2PU");
		EntityManager m=f.createEntityManager();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a person id");
		int pid= in.nextInt();
		Person p1=m.find(Person.class, pid);
		System.out.println("details of person are...");
		Address a1=p1.getAddress();
		System.out.println(p1.getName()+"\t lives in "+a1.getCity()+"\t"+a1.getState());
		System.out.println("Enter a address id");
		int aid= in.nextInt();
		Address add=m.find(Address.class, aid);
		Person p2=add.getPerson();
		System.out.println("details of address...");
		System.out.println(add.getCity()+"\t"+add.getState());
		System.out.println(p2.getName()+"\t lives there.");
		m.close();
		f.close();
	}
}
