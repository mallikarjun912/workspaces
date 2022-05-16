package spring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Item getItem() {
		Item item = new Item();
		item.setCode(111);
		item.setItemname("Monitors");
		item.setQuantity(20); 
		return item;
	}
}
