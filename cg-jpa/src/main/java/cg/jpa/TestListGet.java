package cg.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestListGet {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		TestList list = manager.find(TestList.class, 1);
		System.out.println(list.getName()+" "+list.getSkills());  
	
	}

}
