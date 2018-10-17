import java.io.*;
import java.net.*;

class Sender
{
 public static void main(String  arr[])
 {
   try
  {
    BufferedReader  br = new BufferedReader(new  InputStreamReader(System.in));
    
    DatagramSocket  s = new DatagramSocket(3000);
     
    System.out.println("Sender is ready , type  message to send ,  ctrl+c to terminate...");

    while(true)
    {
      System.out.println("Enter message..");
      String  str = br.readLine();
      byte  data[] = str.getBytes();
      DatagramPacket  p = new  DatagramPacket(data,  data.length,  InetAddress.getLocalHost(), 4000);
      s.send(p);
      System.out.println("Message  Successfully  sent...");
    
    }
     }catch(Exception  e)
     {
       System.out.println(e);
     }
  }
}
