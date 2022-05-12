package cg.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class JpaCrieriaQueries {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = emf.createEntityManager();
		
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = builder.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);
		CriteriaQuery<Employee> select =  cq.select(root);
		Query qry = manager.createQuery(select);
		List<Employee> emplist = qry.getResultList();
		for(Employee e : emplist)
			System.out.println(e.getEmpcode()+e.getEmpname()+e.getSalary()+e.getDob());
	}

}
