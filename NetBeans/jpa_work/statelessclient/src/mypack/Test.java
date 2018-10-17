package mypack;
import javax.naming.InitialContext;
public class Test {
public static void main(String arr[])
{
try
{
System.out.println("performing lookup...");
InitialContext ctx=new InitialContext();
AdderRemote adder=(AdderRemote)ctx.lookup("myAdder");
if (adder !=null)
{
System.out.println("Ejb Reference obtained, invoking business method...");
System.out.println("sum is:"+adder.add(1,6));
}
}catch(Exception e)
{
System.out.println(e);	
}
}
}
