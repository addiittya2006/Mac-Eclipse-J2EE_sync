package mypack;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
public class SimpleHandler extends TagSupport
{
      public int doStartTag()
             {
                 JspWriter out=pageContext.getOut();
                 try
                      {
                         out.println("<br><b> It is generated from the doStartTag()...</b>");
                      }catch(Exception e){}
                   //return SKIP_BODY;
                     return EVAL_BODY_INCLUDE;
             }
       public int doEndTag()
                {
                     JspWriter out=pageContext.getOut();
                      try
                         {
                           out.println("<br><b> It is generated from the doEndTag()...</b>");
                         }catch(Exception e){}
                     //return SKIP_PAGE;
                       return EVAL_PAGE;
               }
     }


/*   Adding   attributes to a custom tag...
         attributes are used to pass information from the jsp page to the tag handler class
         following steps are required to add attributes to a tag 
         1 for each attribute a data member  must be declared in the tag handler class 
            this data member is used to hold the value of the attribute.
        2. for each data member a  public setter method is need to be defined .. this
            method will get invoked by the tag processor to  set the value of attribute.
        3.  in the tld file u have to add  <attribute> sub element for the all the attributes        
              to be supported by concerned tag.
*/




















