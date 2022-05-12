package many2many;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="customerid")
	private int customerId;
	@Column(name="name",length=20)
	private String name;
	@Column(name="mobile")
	private long mobile;
	// many to many mappings -> mappedBy value is the name given in Bank class -> Set<Customer> customers
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="customers")
	private Set<Bank> banks;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Set<Bank> getBanks() {
		return banks;
	}
	public void setBanks(Set<Bank> banks) {
		this.banks = banks;
	}
	
}
