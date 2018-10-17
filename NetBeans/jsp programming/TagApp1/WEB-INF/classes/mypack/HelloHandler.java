package mypack;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
public class HelloHandler extends TagSupport
{
private String name;
public void setName(String n)
{  
      name=n;  
 } 

public int doEndTag()
    {   
      JspWriter out=pageContext.getOut();
      try
             {
                 out.println("<br><b> Good Morning, "+name+"</b>");
             }catch(Exception e){}
       return EVAL_PAGE;
    }
 }


