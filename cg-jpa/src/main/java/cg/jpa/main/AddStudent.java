package cg.jpa.main;

import java.util.List;

import cg.jpa.entities.Student;
import cg.jpa.service.StudentService;
import cg.jpa.service.StudentServiceImpl;

public class AddStudent {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImpl();
		Student std = new Student();
		std.setStudentName("gemini");
		//int id = service.addStudent(std);
		//System.out.println("id = "+id);
		List<Student> stdList = service.getAllStudents();
		for(Student s : stdList)
			System.out.println(s.getSlno()+" "+s.getStudentName());  
	}

}
