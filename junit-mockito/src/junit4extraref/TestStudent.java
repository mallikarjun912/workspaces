package junit4extraref;

import static org.junit.Assert.*; 
import org.junit.Test;
import org.junit.*;


public class TestStudent 
{
	@Test
	public void testGetRollNo()
	{
		Student s = new Student(100, "Sam", "Dcosta");
		assertEquals(s.getRollNo(), 100);
	}
	@Test
	public void testGetFirstName()
	{
		Student s = new Student(100, "Sam", "Dcosta");
		assertEquals(s.getFirstName(), "Sam");
	}
	@Ignore("The method is being modified")
	@Test
	public void testGetLastName()
	{
		Student s = new Student(100, "Sam", "Dcosta");
		assertEquals(s.getLastName(), "Dcosta");
	}
}