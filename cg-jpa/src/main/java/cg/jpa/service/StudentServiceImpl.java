package cg.jpa.service;

import java.util.List;

import cg.jpa.dao.StudentDao;
import cg.jpa.dao.StudentDaoImpl;
import cg.jpa.entities.Student;

public class StudentServiceImpl implements StudentService{

	StudentDao dao = new StudentDaoImpl();
	
	@Override
	public int addStudent(Student std) {
		
		return dao.addStudent(std);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.getAllStudents();
	}

	

}
