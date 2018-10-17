package mypack;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
@Stateless(mappedName="empFacade5")
public class EmpBean implements EmpRemote {
@PersistenceContext(unitName="empEntity1PU")
private EntityManager manager;
	public List<Emp> getAllEmp() {
		Query q=manager.createQuery("select e from emp3 e");
		List<Emp> list=q.getResultList();
		return list;
	}
	public Emp getById(int id) {
		return manager.find(Emp.class,id);
	}
	public void remove(int id) {
		Emp e=manager.find(Emp.class,id);
		manager.remove(e);
	}
	public void save(Emp e) {
		manager.persist(e);
	}
	public void update(Emp e) {
		manager.merge(e);
	}

}
