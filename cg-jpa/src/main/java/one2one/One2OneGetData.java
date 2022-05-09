package one2one;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class One2OneGetData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		
		Passport passport = manager.find(Passport.class, "G123765");
		System.out.println(passport.getPassportNo()+passport.getDateIssued()+
				passport.getExpiryDate()+" "+passport.getPerson().getPersonId()+
				passport.getPerson().getPersonName());
		
	}

}
