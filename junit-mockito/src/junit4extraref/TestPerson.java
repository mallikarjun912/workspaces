package junit4extraref;

import static org.junit.Assert.*;

import org.junit.*;

public class TestPerson {
	@Test
	public void testGetFullName() {
		System.out.println("from TestPerson1");
		Person per = new Person("Robert", "King");
		assertEquals("Robert King", per.getFullName());
	}

	@Test
	public void testNullsInName() {
		System.out.println("from TestPerson1");
		Person per1 = new Person(null, null);
		assertNotNull("full name null", per1.getFullName());
		assertNotNull("First name null", per1.getFirstName());

		Person per2 = new Person("Robert", "King");
		assertEquals("Robert King", per2.getFullName());
	}

	@Test
	public void testGetFirstName() {
		Person p = new Person("Robert", "King");
		assertEquals(p.getFirstName(), "Robert");
	}

	@Test
	public void testGetLastName() {
		Person p = new Person("Robert", "King");
		assertEquals(p.getLastName(), "King");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testForException() {
		System.out.println("from TestPerson2 testing exceptions");
		Person per1 = new Person(null, null);
	}
}