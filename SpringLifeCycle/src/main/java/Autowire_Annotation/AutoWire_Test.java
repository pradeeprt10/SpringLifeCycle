package Autowire_Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import LifeCycle_SpringBean_Annotation.LifeCycle_Using_Annotation;

public class AutoWire_Test {

	public static void main(String[] args) {
		AbstractApplicationContext abst = new ClassPathXmlApplicationContext("Autowire_Annotation/Autowire_Example.xml");
		abst.registerShutdownHook();
		Employee ano = abst.getBean("emp",Employee.class);
		System.out.println(ano);
				
	}
}
