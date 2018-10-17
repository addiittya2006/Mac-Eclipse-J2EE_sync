package mypack;
import java.util.Scanner;
import java.util.List;
import java.util.*;
import javax.persistence.*;
public class SelectTest {
public static void main(String[] args) {
try
{       
EntityManagerFactory f=Persistence.createEntityManagerFactory("Jp_Has_A6PU");
EntityManager manager=f.createEntityManager();
Scanner in=new Scanner(System.in);
System.out.print("Enter customer id");
int cid= in.nextInt();
Customer c1= manager.find(Customer.class, cid);
System.out.println("following cust details are fetched");
System.out.println( c1.getName() +"\t" + c1.getAnnualIncome());
System.out.println("following policies are purchased by this customer");
Set <Policy> set = c1.getPolicies();
// Systemn.out.println( set );
Iterator <Policy> itr=set.iterator();
while(itr.hasNext())
{
	Policy p=itr.next();
	System.out.println(p.getId()+"\t"+ p.getName()+"\t"+p.getSumassured());
}
System.out.println( "Enter Policy Id");
int pid= in.nextInt();
Policy policy=manager.find(Policy.class, pid);
System.out.println("Policy Detail");
System.out.println(policy.getName()+"\t"+policy.getSumassured());
System.out.println("Its Customer Detail");
  Customer cust= policy.getCustomer();
  System.out.println(cust.getId()+"\t"+ cust.getName()+ "\t"+ cust.getAnnualIncome());
manager.close();
}catch(Exception e)
    {
       System.out.println(e);	
}
}
}





