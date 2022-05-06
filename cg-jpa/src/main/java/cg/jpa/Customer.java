package cg.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int slno;
	@Column(length = 30)
	private String custname;
	@ElementCollection
	@Column
	private List<String> mobileno;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public List<String> getMobileno() {
		return mobileno;
	}
	public void setMobileno(List<String> mobileno) {
		this.mobileno = mobileno;
	}
	
}
