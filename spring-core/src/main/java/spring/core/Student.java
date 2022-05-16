package spring.core;

public class Student {
	private int rno;
	private String stdname;
	private String group;
	private Address address;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
