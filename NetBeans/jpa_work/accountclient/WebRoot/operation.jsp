<%@ page import="mypack.*" %>
<%
Account account=(Account)session.getAttribute("account");
String opr=request.getParameter("operation");
  if(opr.equals("balance"))
      {
           int b=account.getBalance();
           out.println("<b>Your Current balance is : "+b+"</b><br>"); 
      }
  else
            {
                   int amt=Integer.parseInt(request.getParameter("txtAmount"));
                   if (opr.equals("deposit"))
                       {
                          account.deposit(amt);
                          out.println("<b> Amount is successfully deposited. </b><br>");
                        }
                      else
                           {
                                if(account.withdraw(amt))
                                   out.println("<b> Amount is successfully withdrawn. </b><br>");
                               else
                                  out.println("<b> Insufficient Amount, transaction failed. </b><br>");
                       }
            }
 %>
  <jsp:include page="operations.html" />
