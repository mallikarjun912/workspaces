package cg.jpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<String> mobiles = new ArrayList<String>(Arrays.asList("4567","2233"));
		Customer cust = new Customer();
		cust.setCustname("xyz");
		cust.setMobileno(mobiles); 
		transaction.begin();
		//manager.persist(cust); 
		transaction.commit();
	}

}
