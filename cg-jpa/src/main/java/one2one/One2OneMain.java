package one2one;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class One2OneMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		Person person = new Person();
		person.setPersonName("abcd");
		person.setCity("chennai"); 
	
		Passport passport = new Passport();
		passport.setPassportNo("A223344");
		Date dateIssued = new Date();
		passport.setDateIssued(dateIssued); 
		
		// to set expiry date to 10 years
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateIssued);
		cal.add(Calendar.YEAR, 5);
		
		Date dateExpiry = cal.getTime();
		passport.setExpiryDate(dateExpiry); 
		passport.setPerson(person);  
		
		tran.begin();
		manager.persist(passport);
		tran.commit();
		manager.close();
	}

}
