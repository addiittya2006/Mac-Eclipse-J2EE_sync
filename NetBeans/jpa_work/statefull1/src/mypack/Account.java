package mypack;
import javax.ejb.Remote;
@Remote
public interface Account 
     {
        public void deposit(int amt);
        public boolean withdraw(int amt);
        public int getBalance();
    }
