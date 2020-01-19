package mypack;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class IterationHandler extends TagSupport
{
private int ctr;

public void setCounter(String c)
{
ctr=Integer.parseInt(c);
}
public int doStartTag()
{
return EVAL_BODY_INCLUDE;
}

public int doAfterBody()
{
ctr--;
if (ctr >0)
return EVAL_BODY_AGAIN;
else
return SKIP_BODY;
}
}
