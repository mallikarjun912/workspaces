package cg.jpa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@SequenceGenerator(name = "emp_seq", initialValue = 100, 
			sequenceName = "emp_code_gen", allocationSize = 2)
	@GeneratedValue(generator = "emp_seq", strategy = GenerationType.SEQUENCE)
	private int empcode;
	@Column(name = "empname", length = 30)
	private String empname;
	@Column(name = "salary")
	private double salary;
	@Column(name = "dob",columnDefinition = "date default current_date")
	private Date dob;
	
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDob() {
		return dob;
	}
}
