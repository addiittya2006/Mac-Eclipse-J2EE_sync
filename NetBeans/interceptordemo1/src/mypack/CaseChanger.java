package mypack;
import java.util.Enumeration;
import javax.servlet.ServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
public class CaseChanger implements Interceptor {
	public void destroy() {	}
	public void init() {}
	public String intercept(ActionInvocation ai) throws Exception {
		ValueStack vs=ai.getStack();
		ServletRequest request=ServletActionContext.getRequest();
		Enumeration< String> e=request.getParameterNames();
		while(e.hasMoreElements())
		{
			String pName=e.nextElement();
			String pValue=vs.findString(pName);
			vs.set(pName, pValue.toUpperCase());
		}
		String s = ai.invoke();
		return s;
	}
}
