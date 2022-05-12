package many2many;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Many2ManyJpaQueries {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		Query qry1 = manager.createQuery("from Bank");
		List<Bank> banks = qry1.getResultList();
		for(Bank b : banks) {
			System.out.print(b.getBankId()+b.getBranchName()+b.getSwiftCode()+"  ");
			Set<Customer> customers = b.getCustomers();
			for(Customer c : customers) {
				System.out.println(c.getCustomerId()+c.getName()+c.getMobile());  
			}
		}
		//calling from customers
		Query qry2 = manager.createQuery("from Customer");
		List<Customer> custList = qry2.getResultList();
		for(Customer c : custList) {
			System.out.print(c.getCustomerId()+c.getName()+c.getMobile()+" :  ");  
			Set<Bank> bankList = c.getBanks();
			for(Bank b : bankList) 
				System.out.print(b.getBankId()+b.getBranchName()+b.getSwiftCode()+"  ");
		}
	}

}
