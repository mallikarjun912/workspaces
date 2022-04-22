package junit5demo;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings = { "Hello", "JUnit" })
	void withValueSource(String word) {
		assertNotNull(word);
	}
}
