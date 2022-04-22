package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MessageUtilTest {
	String message = "Hyderabad";
	MessageUtil msg = new MessageUtil(message);
	
	@Test(expected = ArithmeticException.class)
	public void testExceptionMessage() {
		System.out.println("Inside testExceptionMessage()");
		msg.exceptionMessage();
	}
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi "+ "Hyderabad";
		assertEquals(message, msg.salutationMessage()); 
	}

}
