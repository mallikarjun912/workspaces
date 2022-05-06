package cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeCrud {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Employee emp = manager.find(Employee.class,102);
		System.out.println(emp.getEmpcode()+emp.getEmpname()+emp.getSalary()); 
		transaction.begin();
		emp.setSalary(7500);
		//manager.persist(emp);
		manager.remove(emp); 
		transaction.commit();
		manager.close();
	}

}
