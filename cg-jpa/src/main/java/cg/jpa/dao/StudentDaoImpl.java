package cg.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cg.jpa.entities.Student;

public class StudentDaoImpl implements StudentDao{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	@Override
	public int addStudent(Student std) {
		transaction.begin();
		manager.persist(std);
		transaction.commit();
		return std.getSlno();
	}

	@Override
	public List<Student> getAllStudents() {
		Query qry = manager.createNamedQuery("findall");
		return qry.getResultList(); 
	}

}
