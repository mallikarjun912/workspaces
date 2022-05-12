package one2many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToManyInsertion {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		//create college object
		College college = new College();
		college.setCollegeCode("CG101");
		college.setCollegeName("Cap-Gemini");
		college.setLocation("Hyderabad"); 
		
		//create course objects
		Courses c1 = new Courses();
		c1.setCourseId(501);
		c1.setCourseName("CSE");
		c1.setCapacity(120);
		c1.setCollege(college); //Assign to college 
		
		Courses c2 = new Courses();
		c2.setCourseId(401);
		c2.setCourseName("ECE");
		c2.setCapacity(60);
		c2.setCollege(college); //Assign to college
		
		//create course list objects
		List<Courses> courseList = new ArrayList<Courses>();
		courseList.add(c1);
		courseList.add(c2);
		//assign course list object to college		
		college.setCourses(courseList); 
		
		tran.begin();
		manager.persist(college); 
		tran.commit();
		manager.close();
	}

}
