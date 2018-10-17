package mypack;
import java.sql.*;
  public class UserBean
          {
            private String name,password,mailId;
            public String getName()   {return name;}
            public void setName(String n) {name=n;}
            public String getPassword(){return password;}
            public void setPassword(String p){password=p;}
            public String getMailId(){return mailId;}
            public void setMailId(String m){mailId=m;}

           private Connection getConnection()
                {
                   try{
                      Class.forName("oracle.jdbc.driver.OracleDriver");
                      return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
                      }catch(Exception e)
                             {
                                  System.out.println(e);
                                  return null;
                            }
                 }
            public boolean register()
                    {    try   {   Connection con=getConnection();
                                      PreparedStatement stmt=con.prepareStatement("insert into userinfo values(?,?,?)");
                                      stmt.setString(1,mailId);
                                      stmt.setString(2,name);
                                       stmt.setString(3,password);
                                       stmt.executeUpdate();
                                       con.close();
                                       return true;
                                   }catch(Exception e)
                                          {
                                                System.out.println(e);
                                                return false;
                                           }
                    }
           }























