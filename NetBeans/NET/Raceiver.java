import java.io.*;
import java.net.*;

class Raceive
{
    public static void main(String [] arguchu)
    {  
      try
      {
         DatagramSocket s= new DatagramSocket(100);
          byte b[];
          DatagramPacket p=new DatagramPacket(b,b.length);
           s.receive(p);
          System.out.println(b); 
  }catch(Exception e)
{
System.out.println(e);
}
       
    }
}