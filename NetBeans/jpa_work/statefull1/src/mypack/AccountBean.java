package mypack;
import javax.ejb.Stateful;
@Stateful(mappedName="myAccount")
public class AccountBean implements Account{
private int amount;
	public void deposit(int amt) {
		amount+=amt;
	}
	public int getBalance() {		return amount;  	}
	public boolean withdraw(int amt) 
	{		if(amt<amount)
	     {
			amount-=amt;
			return true;
		}
		else
		return false;
	} 
   }
