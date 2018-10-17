                                                                    import java.io.*;

class MessageReader
{
  public static String  readMessage(InputStream  in, char  ch)
 {
   int  c;
   String  str = new String();

   try
 { 
   while(true )
   {
     c = in.read();
      if(c==ch)
        return str;
    str = str +(char)c;
   }

  }catch(Exception  e)
    {
      return "Error in reading data  from socket";
     }
   }
}
