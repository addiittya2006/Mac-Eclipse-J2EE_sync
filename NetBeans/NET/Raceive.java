import java.io.*;
import java.net.*;

class Raceive
{
    public static void main(String [] arguchu)
    {  
      try
      {
         DatagramSocket s= new DatagramSocket(3000);
          byte b[]=new byte[25];
          char c;
          while(true)
	{
          DatagramPacket p=new DatagramPacket(b,b.length);
           s.receive(p);
           for(int i=0;i<b.length;i++)
         {                              
           c=(char) b[i];
           System.out.print(c); 
         }}
  }catch(Exception e)
{
System.out.println(e);
}
       
    }
}