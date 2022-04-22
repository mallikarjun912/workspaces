package junit4extraref;

import org.junit.Test;
 import static org.junit.Assert.*;


public class GreetingTest {
@Test
public void testGreet()
{
	Greeting greeting = new Greeting();
	assertEquals("Unexpected result : ","WELCOME TO Java", greeting.greet());
}
}
