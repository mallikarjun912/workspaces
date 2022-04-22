package mockito;

import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester 
{
	//@InjectMocks annotation is used to create and inject the mock object
	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	@Test
	public void testAdd()
	{
		//add the behavior of calc service to add two numbers
		when(mathApplication.add(10,20)).thenReturn(30);
		//test the add functionality
		//Assert.assertEquals(mathApplication.add(10, 20),30);
	}
	@Test
	public void testSubtract() {
		when(mathApplication.subtract(20, 10)).thenReturn(10);
	}
	@Test
	public void testMultiply() {
		when(mathApplication.multiply(5, 6)).thenReturn(30);
	}
	@Test
	public void testDivide() {
		when(mathApplication.divide(6, 7)).thenReturn(42);
	}
}
