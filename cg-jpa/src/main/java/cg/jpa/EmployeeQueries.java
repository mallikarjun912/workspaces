package cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeQueries {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		// To get single entity
		try {
		       Employee  emp = manager.find(Employee.class, 101);
		       System.out.println(emp.getEmpcode()+emp.getEmpname()+emp.getSalary()+emp.getDob()); 
		}
		catch(NullPointerException e) {
			//e.printStackTrace();
			System.out.println("employee doesn't exists...");
		}
		manager.close();
	}

}
