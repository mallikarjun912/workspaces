package cg.jpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestListMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<String> list = new ArrayList<String>(Arrays.asList("java","html"));
		TestList test = new TestList();
		test.setName("abcd");
		test.setSkills(list); 
		transaction.begin();
		manager.persist(test); 
		transaction.commit();
		
	}

}
