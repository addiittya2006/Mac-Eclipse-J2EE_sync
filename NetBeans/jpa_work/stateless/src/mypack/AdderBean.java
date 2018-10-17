package mypack;

import javax.ejb.Stateless;

@Stateless (mappedName="myAdder")
public class AdderBean implements AdderRemote {

	public int add(int x, int y) {
		System.out.println("Ejb method invoked.");
		return (x+y);
	}

}
