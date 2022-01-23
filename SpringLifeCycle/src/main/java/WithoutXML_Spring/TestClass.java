package WithoutXML_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

	public static void main(String[] args) {
	
		ApplicationContext cxt= new AnnotationConfigApplicationContext(Config_Student_Dept.class);
     Student s1= cxt.getBean("getstd",Student.class);
     s1.display();
		
	}

}
