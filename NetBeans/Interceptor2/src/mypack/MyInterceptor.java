package mypack;
import java.util.Enumeration;
import javax.servlet.ServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class MyInterceptor implements Interceptor {
	public void destroy() {	}
	public void init() {}
public String intercept(ActionInvocation ai) throws Exception {
ValueStack vs=ai.getStack();
ServletRequest request=ServletActionContext.getRequest();
Enumeration<String> e=request.getParameterNames();
	while(e.hasMoreElements())
	{
		String pName=e.nextElement();
		String pValue=request.getParameter(pName);
		vs.set(pName, pValue);
	}
// return("success");
	String s= ai.invoke();
	// post processing logic
	return s;
	}
}











