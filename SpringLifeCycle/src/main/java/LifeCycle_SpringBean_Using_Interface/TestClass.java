package LifeCycle_SpringBean_Using_Interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle_SpringBean_Using_Interface/InterfaceImp.xml");
		context.registerShutdownHook();
		Pepsi conref = (Pepsi) context.getBean("LifeCycleInterface");
		System.out.println(conref);
		
	}
}