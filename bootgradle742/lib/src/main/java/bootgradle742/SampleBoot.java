package bootgradle742;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleBoot {
	public static void main(String[] args) {
		SpringApplication.run(SampleBoot.class, args);
		System.out.println("hello");
	}

}
