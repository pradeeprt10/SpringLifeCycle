package SterioAnnotation_Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCase {
 
	public static void main(String[] args) {
	
		ApplicationContext cxt = new ClassPathXmlApplicationContext("SterioAnnotation_Component/SterioCase.xml");
	    Student std1 = cxt.getBean("student",Student.class);
		System.out.println(std1);
	}
	
    
}
