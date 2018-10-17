package mypack;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
public class BodyHandler extends BodyTagSupport
       {
           public int doStartTag()
                  {         return EVAL_BODY_BUFFERED;    }
             public  void  doInitBody()
                        {
                                System.out.println("  Init method from  BodyHandler....");
                        }   
                public int doEndTag()
                           {
                               String body=bodyContent.getString();
                               JspWriter out=pageContext.getOut();
                               try
                                   {
                           out.println( "<font  color=red  size=10> " +  body.toUpperCase()   +  "</font>" );
                                   }catch(Exception e){}
                               return EVAL_PAGE;
                        }
        }

