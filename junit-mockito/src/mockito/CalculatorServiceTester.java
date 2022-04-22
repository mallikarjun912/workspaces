package mockito;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTester {

	//@Mock annotation is used to create the mock object to be injected
	@Mock
	CalculatorService calcService;
	
	@Test
	public void testAdd()
	{
		//add the behavior of calc service to add two numbers
		when(calcService.add(10,20)).thenReturn(30);
		//test the add functionality
		//Assert.assertEquals(mathApplication.add(10, 20),30);
	}
	@Test
	public void testSubtract() {
		when(calcService.subtract(20, 10)).thenReturn(10);
	}
	@Test
	public void testMultiply() {
		when(calcService.multiply(5, 6)).thenReturn(30);
	}
	@Test
	public void testDivide() {
		when(calcService.divide(6, 7)).thenReturn(42);
	}
}
