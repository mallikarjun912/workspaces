package spring.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ItemApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Item item = ctx.getBean("getItem",Item.class);
		System.out.println(item.getCode()+" "+item.getItemname()+" "+item.getQuantity()); 
		ctx.close();
	}
}
