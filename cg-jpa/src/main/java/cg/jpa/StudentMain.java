package cg.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cg.jpa.entities.Student;

public class StudentMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Student std = new Student();
		std.setStudentName("gavinking");
		
		transaction.begin();
		manager.persist(std);
		transaction.commit();
		manager.close();

	}

}
