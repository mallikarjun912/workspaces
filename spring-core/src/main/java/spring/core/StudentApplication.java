package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Student std = ctx.getBean("student",Student.class);
		Address addr = ctx.getBean("addr",Address.class);
		addr.setStreet("aaaa");
		addr.setCity("Bangalore");
		std.setAddress(addr); 
		System.out.println(std.getRno()+std.getStdname()+std.getGroup()+" "+
				std.getAddress().getStreet()+" "+std.getAddress().getCity());  
	}

}
