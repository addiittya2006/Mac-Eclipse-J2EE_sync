package mypack;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.*;
import com.opensymphony.xwork2.util.ValueStack;
public class UpperInterceptor implements Interceptor {

	public void destroy() {	}

	public void init() {}

	public String intercept(ActionInvocation ai) throws Exception {
            
	ValueStack	stack=ai.getStack();
	String name=stack.findString("name");
	stack.set("name",name.toUpperCase());
		return  ai.invoke();
	}

}
