package cg.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPAQueries {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select e from Employee e where e.empcode>=?1");
		qry.setParameter(1, 120);
		List<Employee> emplist = qry.getResultList();
		for(Employee e : emplist)
			System.out.println(e.getEmpcode()+e.getEmpname()+e.getSalary()+e.getDob());   

	}

}
