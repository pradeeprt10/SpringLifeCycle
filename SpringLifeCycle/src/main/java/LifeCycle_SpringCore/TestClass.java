package LifeCycle_SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle_SpringCore/LifeCycle_SpringCore.xml");
		Life_Cycle_Example conref = (Life_Cycle_Example) context.getBean("LifeCycle");
		System.out.println(conref);
		context.registerShutdownHook();
	}
}