package cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Employee emp = new Employee();
		emp.setEmpcode(101);
		emp.setEmpname("mlk");
		emp.setSalary(5000); 
		
		transaction.begin();
		manager.persist(emp);
		transaction.commit();
		manager.close();
		
		
	}
}
