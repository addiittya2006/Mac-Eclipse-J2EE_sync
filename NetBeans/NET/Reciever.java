import  java.io.*;
import  java.net.*;

class Receiver
{
  public  static  void  main(String  arr[])
 {
   try
   {
     DatagramSocket   r = new  DatagramSocket(4000);
     byte d [] = new  byte[500];

     DatagramPacket  p = new  DatagramPacket(d,500);
     System.out.println("Receiver is  ready,  waiting for  message...");
     
     while(true)
     {
       r.receive(p);
       System.out.println("Received msg :" +  new  String(p.getData()).trim() );
     }
   }catch(Exception e)
     {
        System.out.println(e);
     }
   }
} 