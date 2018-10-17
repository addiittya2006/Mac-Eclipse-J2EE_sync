package mypack;
import javax.ejb.*;
@Remote
public interface AdderRemote   {
 public int add(int x,int y);
}
