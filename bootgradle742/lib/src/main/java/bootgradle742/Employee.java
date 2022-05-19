package bootgradle742;

public class Employee {
	private int code;
	private String empname;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int code, String empname, double salary) {
		this.code = code;
		this.empname = empname;
		this.salary = salary;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
	
}
