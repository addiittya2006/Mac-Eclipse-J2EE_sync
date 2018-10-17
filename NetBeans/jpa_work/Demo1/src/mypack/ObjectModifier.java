package mypack;
import java.util.Scanner;
import java.util.List;

import javax.persistence.*;
public class ObjectModifier {
	public static void main(String[] args) {
		try
		{
		EntityManagerFactory f=Persistence.createEntityManagerFactory("Demo1PU");
		EntityManager manager=f.createEntityManager();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter id to modify");
		int id= in.nextInt(); in.nextLine();
		Emp e= manager.find(Emp.class, id);
		System.out.println("current details are");
		System.out.println( e.getEname() +"\t" + e.getJob()+"\t"+ e.getSalary());
		System.out.println("Enter name to update");
		String n=in.nextLine();
		System.out.println("Enter job to update");
		String j=in.nextLine();
		System.out.println("Enter salary to update");
		int s=in.nextInt();
		EntityTransaction t=manager.getTransaction();
		t.begin();
		e.setEname(n);
		e.setJob(j);
		e.setSalary(s);
		t.commit();
		manager.close();
		System.out.println("updated");
		}catch(Exception e)
		{
		System.out.println(e);	
		}
		}
}
