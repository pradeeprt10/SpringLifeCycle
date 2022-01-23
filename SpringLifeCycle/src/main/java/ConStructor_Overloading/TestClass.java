package ConStructor_Overloading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("ConStructor_Overloading/ConOverLoad.xml");
		ConOverLoading conref =(ConOverLoading)con.getBean("Con1");
		System.out.println(conref);
	}

}
