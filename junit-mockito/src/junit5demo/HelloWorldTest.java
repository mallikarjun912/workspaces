package junit5demo;
import org.junit.jupiter.api.Test;

class HelloWorldTest implements TestLifecycleLogger{

	@Test
	void test() {
		System.out.println("First Test Case");
	}

	

}
