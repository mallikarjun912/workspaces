package one2one;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class One2OneGetData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		
		Passport passport = manager.find(Passport.class, "A223344");
		System.out.println(passport.getPassportNo()+" "+passport.getDateIssued()+
				passport.getExpiryDate()+" "+passport.getPerson().getPersonId()+" "+
				passport.getPerson().getPersonName());
		
		Person person = manager.find(Person.class,1);
		System.out.println(person.getPersonId()+" "+person.getPersonName()+" "+
				person.getPassport().getPassportNo()); 
	}

}
