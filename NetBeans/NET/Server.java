import java.io.*;
import java.net.*;
class Server
{
  public  static  void main(String  arr[])
 {
   try
  {
    ServerSocket   st = new ServerSocket(2500);
          System.out.println("Server is ready to listening for connection");
       Socket  t = st.accept();
        //  Thread.sleep(4000);
    System.out.println("connection  granted  waiting  for client's  message...");
    InputStream in = t.getInputStream();
    String msg = MessageReader.readMessage(in, '$');
    Thread.sleep(4000);
    System.out.println("Client's message recieved:  " + msg);
    System.out.println("Sending acknowledgement...");
    OutputStream out = t.getOutputStream();
    msg = "Hi CLient! your message is recieved $";
    Thread.sleep(4000);
    out.write(msg.getBytes());
    System.out.println("ack. sent, closing connection...");
    t.close();
    }catch(Exception e)
      {
        System.out.println(e);
      }
   }
 }


 