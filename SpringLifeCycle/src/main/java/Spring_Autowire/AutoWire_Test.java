package Spring_Autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import LifeCycle_SpringBean_Annotation.LifeCycle_Using_Annotation;

public class AutoWire_Test {

	public static void main(String[] args) {
		AbstractApplicationContext abst = new ClassPathXmlApplicationContext("Spring_Autowire/Autowire_Example.xml");
		abst.registerShutdownHook();
		Employee ano = abst.getBean("AutowireExample",Employee.class);
		System.out.println(ano);
				
	}
}
