package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestArithmetic {
	Arithmetic ath = new Arithmetic();
	
	@BeforeAll
	public static void beforeAllTests() {
		System.out.println("** before all tests **");
	}
	
	@AfterAll
	static void afterAllTests() {
		System.out.println("** after all tests **");
	}
	@BeforeEach
	void beforeEachTest() {
		System.out.println("** before each test **");  
	}
	@Disabled
	@Test
	void testAddPositive() {
		assertEquals(10, ath.add(5,5)); 
	}
	
	@Test
	void testAddNegative() {
		assertNotEquals(10, ath.add(3, 6));  
	}

}
