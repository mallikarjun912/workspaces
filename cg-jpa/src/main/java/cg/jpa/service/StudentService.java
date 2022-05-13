package cg.jpa.service;

import java.util.List;

import cg.jpa.entities.Student;

public interface StudentService {
	int addStudent(Student std);
	List<Student> getAllStudents();
}
