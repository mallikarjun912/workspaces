package many2many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Many2ManyMain {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		Bank bank1 = new Bank();
		bank1.setName("SBI");
		bank1.setBranchName("Hyderabad");
		bank1.setSwiftCode("SBI1234");
		
		Bank bank2 = new Bank();
		bank2.setName("SBI");
		bank2.setBranchName("BANGALORE");
		bank2.setSwiftCode("SBI5678");
		
		Set<Bank> banks = new HashSet<Bank>();
		banks.add(bank1);
		banks.add(bank2);
		
		Customer c1 = new Customer();
		c1.setName("mlk");
		c1.setMobile(123456L); 
		
		Customer c2 = new Customer();
		c2.setName("cts");
		c2.setMobile(89845345L);
		
		Customer c3 = new Customer();
		c3.setName("sagar");
		c3.setMobile(9834343L); 
		
		Customer c4 = new Customer();
		c4.setName("rk");
		c4.setMobile(111334455L); 
		
		Set<Customer> customerSet1 = new HashSet<Customer>();
		customerSet1.add(c1);
		customerSet1.add(c2);
		bank1.setCustomers(customerSet1);
		
		Set<Customer> customerSet2 = new HashSet<Customer>();
		customerSet2.add(c2);
		customerSet2.add(c3);
		customerSet2.add(c4);
		bank2.setCustomers(customerSet2); 
		
		tran.begin();
		manager.persist(bank1);
		manager.persist(bank2);
		tran.commit();
		manager.close();
		
	}
}
