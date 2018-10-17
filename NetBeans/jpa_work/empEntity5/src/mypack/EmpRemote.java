package mypack;
import java.util.*;
import javax.ejb.Remote;
@Remote
public interface EmpRemote {
public Emp getById(int id);
public List<Emp> getAllEmp();
public void save(Emp e);
public void update(Emp e);
public void remove(int id);
}
