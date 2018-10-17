import java.net.*;
class  URLDemo
{

  public static void main(String [] args )throws MalformedURLException 
 {
   URL  hp = new URL ("http:// www.osborne.com/downloads");
   
   System.out.println("protocol=" + hp.getProtocol());
  System.out.println("port=" + hp.getPort());
 System.out.println("Host=" + hp.getHost());
  System.out.println("File=" + hp.getFile());
  System.out.println("Ext=" + hp.toExternalForm());   
 }
}
