package mypack;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
public class SimpleHandler extends TagSupport
{    public int doStartTag()
           {
                 JspWriter out=pageContext.getOut();
                  try   {
                              out.println("<br><b> It is generated from the doStartTag()...</b>");
                          }catch(Exception e){}
                            return SKIP_BODY;     //  here   SKIP_BODY  is  a predefined constant
            }                                                     
            public int doEndTag()
                    {
                           JspWriter out=pageContext.getOut();
                            try
                                 {
                                      out.println("<br><b> It is generated from the doEndTag()...</b>");
                                 }catch(Exception e){}
                                   return EVAL_PAGE;            //  here  SKIP_PAGE  is the  predefined constants...
                    }
         }

      //      SKIP_BODY   or   SKIP_PAGE   these constants are used to  control  flow of  execution
      //  of  tag  or  flow of   execution of   jsp  page.

     
