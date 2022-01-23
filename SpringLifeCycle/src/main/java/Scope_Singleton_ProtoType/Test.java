package Scope_Singleton_ProtoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext cnn=new ClassPathXmlApplicationContext("Scope_Singleton_ProtoType/Singleton_Prototype.xml");	
	Employee emp1 = cnn.getBean("employee",Employee.class);	
	System.out.println(emp1);
	System.out.println(emp1.hashCode());
	Employee emp2 = cnn.getBean("employee",Employee.class);
	System.out.println(emp2);
	System.out.println(emp2.hashCode());
	}
}
