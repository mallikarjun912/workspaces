package cg.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@NamedQueries({ @NamedQuery(name = "findall",query = "from Student"),
			    @NamedQuery(name = "findById",
			          query = "select std from Student std where std.slno=?1") })
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slno;
	@Column(name = "student_name",columnDefinition = "varchar(30)", nullable = false)
	private String studentName;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
