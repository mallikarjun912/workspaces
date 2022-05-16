package spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "dept")
public class Department {
	@Value("10")
	private int deptno;
	@Value("Marketing")
	private String deptname;
	@Autowired
	private Staff staff;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Staff getStaff() {
		return staff;
	}
}
