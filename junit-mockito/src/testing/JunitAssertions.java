package testing;

import org.junit.Assert;
import org.junit.Test;

public class JunitAssertions {
	String obj1 = "capgemini"; 
    String obj2 = "capgemini"; 
  
    String obj5 = null; 
    int var1 = 15; 
    int var2 = 25; 
    int[] arithmetic1 = { 10, 20, 30 }; 
    int[] arithmetic2 = { 10, 20, 30}; 
	@Test 
    public void testEquals() { 
		Assert.assertEquals("they are not equal",obj1, obj2); 
	}
	@Test
	public void testNull(){
		Assert.assertNull(obj5);
	}
	@Test
	public void testTrue(){
		Assert.assertTrue(var1 < var2);
	}
	@Test
	public void testArrayEquals(){
		Assert.assertArrayEquals(arithmetic1, arithmetic2);
	}
     
}
