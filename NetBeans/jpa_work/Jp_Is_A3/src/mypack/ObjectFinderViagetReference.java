package mypack;
import java.util.Scanner;
import java.util.List;

import javax.persistence.*;
public class ObjectFinderViagetReference {

public static void main(String[] args) {
try
{
EntityManagerFactory f=Persistence.createEntityManagerFactory("InheritanceMappingTwoo");
EntityManager manager=f.createEntityManager();
Scanner in=new Scanner(System.in);
System.out.print("Enter id");
int id= in.nextInt();
Emp e= manager.getReference(Emp.class, id);
System.out.println("following object is fetched");
System.out.println("printing  values via getter methods");
System.out.println( e.getId() + "\t"  +e.getName() +"\t" + e.getJob()+"\t"+ e.getSalary());
manager.close();
}catch(Exception e)
{
System.out.println(e);	
}
}
}
