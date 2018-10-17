//class to find the IP- Address  of  a machine  on a Network

import java.net.*;

class IpFinder10
{
  public static void main(String arr[])
 {
   try
   {
      InetAddress  a =  InetAddress.getByName(arr[0]);
       
      System.out.println("IP  address is:  "  + a);
   
  }catch(Exception  e)
    {
      System.out.println(e);
    }
  }
}




 