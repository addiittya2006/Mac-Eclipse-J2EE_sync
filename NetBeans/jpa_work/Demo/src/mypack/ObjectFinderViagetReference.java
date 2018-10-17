package mypack;
import java.util.Scanner;
import java.util.List;

import javax.persistence.*;
public class ObjectFinderViagetReference {

public static void main(String[] args) {
try
{
EntityManagerFactory f=Persistence.createEntityManagerFactory("DemoPU");
EntityManager manager=f.createEntityManager();
Scanner in=new Scanner(System.in);
System.out.print("Enter id");
int id= in.nextInt();
Emp e= manager.getReference(Emp.class, id);
System.out.println("following object is fetched");
System.out.println("printing object value");
System.out.println( e.ename +"\t" + e.job+"\t"+ e.salary);
System.out.println("printing  values via getter methods");
System.out.println( e.getEname() +"\t" + e.getJob()+"\t"+ e.getSalary());
manager.close();
}catch(Exception e)
{
System.out.println(e);	
}
}
}
