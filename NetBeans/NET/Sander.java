// Project- chat server
import java.io.*;
import java.net.*;

class Sander
{
  public static void main(String ar[])
  {
    try
   {
      DatagramSocket s= new DatagramSocket(2000);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str;
      char x;
      byte  b[];
      System.out.println("1. enter msg/n 2. exit");
      
      while(true)
      {
       str=br.readLine();
                     b= str.getBytes();
                     DatagramPacket   p = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 3000);
	  s.send(p);                     
                     
     

   }
  }
    catch( Exception e)
     {
        System.out.println(e);
      }
 }
}