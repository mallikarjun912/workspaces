package one2one;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class Passport {
	@Id
	@Column(length = 10)
	private String passportNo;
	@Column(columnDefinition = "date")
	private Date dateIssued;
	@Column(columnDefinition = "date")
	private Date expiryDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personId",unique = true)
	private Person person;
	
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public Date getDateIssued() {
		return dateIssued;
	}
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Person getPerson() {
		return person;
	}
}
