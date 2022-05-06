package cg.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetEmployees {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		//to fetch single object
		Employee emp = manager.find(Employee.class, 103);
		System.out.println(emp.getEmpcode()+emp.getEmpname()); 
		//To fetch all the objects
		Query qry = manager.createQuery("from Employee");
		List<Employee> emplist = qry.getResultList();
		emplist.forEach((e)->System.out.println(e.getEmpcode()+emp.getEmpname())); 
		manager.close();
	}

}
