package many2many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Many2ManyQueries {
	public static void main(String[] args) {
		/*
		 * Configuration config = new Configuration();
		 * config.configure("Hibernate.cfg.xml"); SessionFactory sessionFactory =
		 * config.buildSessionFactory(); Session session = sessionFactory.openSession();
		 */
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		
		
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		CriteriaQuery<Bank> criteriaQuery = criteriaBuilder.createQuery(Bank.class);
		Root<Bank> root = criteriaQuery.from(Bank.class);
		criteriaQuery.select(root);
		TypedQuery<Bank> query = manager.createQuery(criteriaQuery);
		List<Bank> bankList = query.getResultList(); 
		for(Bank b : bankList) {
			System.out.print(b.getBankId()+" "+b.getName()+" "+
		b.getBranchName()+" "+b.getSwiftCode());//+" "+b.getCustomers().size());
			for(Customer c : b.getCustomers())
				System.out.println(c.getCustomerId()+" "+c.getName());
		}
		//session.close();
		//sessionFactory.close();
	}
}
