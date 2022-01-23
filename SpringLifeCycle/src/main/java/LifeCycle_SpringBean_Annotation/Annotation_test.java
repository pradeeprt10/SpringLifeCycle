package LifeCycle_SpringBean_Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation_test {

	public static void main(String[] args) {
		AbstractApplicationContext abst = new ClassPathXmlApplicationContext("LifeCycle_SpringBean_Annotation/Annotation_Class.xml");
		abst.registerShutdownHook();
		LifeCycle_Using_Annotation ano = (LifeCycle_Using_Annotation) abst.getBean("Annotation_example");
		System.out.println(ano);
	}

}
