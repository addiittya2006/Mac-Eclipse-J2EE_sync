import  java.io.*;
import  java.net.*;
class  Client
{
  public  static void main(String  arr[]) 
    {
       try
            {
               System.out.println("Sending  connecttion request...");
               Socket  s = new Socket("localhost",2500);
               Thread.sleep(4000);
               System.out.println("connection  completed , sending  message to Server..");
               OutputStream  out = s.getOutputStream();
               String  msg = "Hello Server$" ;
               out.write(msg.getBytes());
               Thread.sleep(4000);
                System.out.println("Message sent  waiting  for ack...");
                InputStream in = s.getInputStream();
                msg = MessageReader.readMessage(in, '$');
                System.out.println("ack  Received :" + msg);
                System.out.println("closing  connection...");
                s.close();
            }catch(Exception e )
                   {
                       System.out.println(e);
                   }
           }
 }
 