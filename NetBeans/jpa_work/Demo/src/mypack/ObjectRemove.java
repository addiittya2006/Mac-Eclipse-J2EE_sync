package mypack;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ObjectRemove {
	public static void main(String[] args) {
		try
		{
		EntityManagerFactory f=Persistence.createEntityManagerFactory("DemoPU");
		EntityManager manager=f.createEntityManager();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter id to delete");
		int id= in.nextInt(); 
		Emp e= manager.find(Emp.class, id);
		
		EntityTransaction t=manager.getTransaction();
		t.begin();
		manager.remove(e);
		t.commit();
		manager.close();
		System.out.println("deleted");
		}catch(Exception e)
		{
		System.out.println(e);	
		}
		}
}
