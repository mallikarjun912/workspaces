package junit5demo;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatingTest {
	@RepeatedTest(5)
	void test() {
		System.out.println("Test Case ..... ");
	}

}
