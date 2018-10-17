package mypack;
import java.util.Scanner;
import javax.persistence.*;

public class ObjectModifier3 
	{
	public static void main(String[] args) 
	{
	final EntityManagerFactory f=Persistence.createEntityManagerFactory("Demo1PU");
		EntityManager manager=f.createEntityManager();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter id to modify");
		final int id= in.nextInt(); in.nextLine();
		Emp e= manager.getReference(Emp.class, id);
	//	Emp e= manager.find(Emp.class, id);  

		Thread t=new Thread(){
			 public void run()
			 {
		       System.out.println("New Thread is updating");
				EntityManager m=f.createEntityManager();
				 Emp e=m.getReference(Emp.class,id);
				 EntityTransaction t=m.getTransaction();
					t.begin();
					e.setEname("Demoname");
					e.setJob("demojob");
					e.setSalary(23000);
					t.commit();
					m.close();
					System.out.println("updated");
			 }
		};
		t.start();
		try{
			System.out.println(" Suspending the main for 2 second");
			Thread.sleep(2000);
       	}catch(Exception ee){}
		
		System.out.println("main Thread is resumed"	);
	
		System.out.println( e.getEname() +"\t" + e.getJob()+"\t"+ e.getSalary());
		}
   }


