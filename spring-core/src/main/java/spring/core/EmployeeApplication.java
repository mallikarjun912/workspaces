package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml"); 
		Employee emp = ctx.getBean("emp",Employee.class); 

		System.out.println(emp.getCode()+" "+emp.getEmpname());  
	}
}
