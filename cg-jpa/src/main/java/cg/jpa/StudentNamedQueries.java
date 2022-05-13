package cg.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cg.jpa.entities.Student;

public class StudentNamedQueries {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		
		Query qry = manager.createNamedQuery("findall");
		List<Student> stdlist = qry.getResultList();
		for(Student s : stdlist)
			System.out.println(s.getSlno()+" "+s.getStudentName()); 
		
		Query qry2 = manager.createNamedQuery("findById");
		qry2.setParameter(1, 2);
		stdlist = qry2.getResultList();
		for(Student s : stdlist)
			System.out.println(s.getSlno()+" "+s.getStudentName()); 
	}

}
