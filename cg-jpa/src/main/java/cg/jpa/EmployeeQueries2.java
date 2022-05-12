package cg.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeQueries2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		
		Query qry = manager.createQuery("from Employee");
		List<Employee> emplist = qry.getResultList();
		emplist.forEach((e)->System.out.println(e.getEmpcode()+" "+e.getEmpname()));
		
		Query qry2 = manager.createQuery("select emp from Employee emp  where emp.empcode>?1");
		qry2.setParameter(1, 120);
		emplist = qry2.getResultList();
		emplist.forEach((e)->System.out.println(e.getEmpcode()+" "+e.getEmpname()));
		Query qry3 = manager.createQuery("select emp from Employee emp  where emp.salary between ?1 and ?2");
		qry3.setParameter(1, 5000.00);
		qry3.setParameter(2, 7000.00);
		emplist = qry3.getResultList();
		emplist.forEach((e)->System.out.println(e.getEmpcode()+" "+e.getEmpname()+" "+e.getSalary()));
		//Query qry4 = manager.createQuery("select emp from Employee emp  where emp.empname like 'a%' ");
		Query qry4 = manager.createQuery("select emp from Employee emp  where emp.empname like :name ");
		qry4.setParameter("name", "%n%");
		emplist = qry4.getResultList();
		emplist.forEach((e)->System.out.println(e.getEmpcode()+" "+e.getEmpname()+" "+e.getSalary()));
		
		
	}

}
