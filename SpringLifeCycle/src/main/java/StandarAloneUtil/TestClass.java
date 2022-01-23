package StandarAloneUtil;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		AbstractApplicationContext cont=new ClassPathXmlApplicationContext("StandarAloneUtil/StandAlonUtil.xml");
		UtilExample utilexamp = cont.getBean("test",UtilExample.class);
		System.out.println(utilexamp.getEmpAddress());
		System.out.println(utilexamp.getEmpAddress().getClass().getName());
		System.out.println("=================");
		System.out.println(utilexamp.getEmpPhone());
		System.out.println(utilexamp.getEmpPhone().getClass().getName());
		System.out.println("=================");
		System.out.println(utilexamp.getEmproject());
		System.out.println(utilexamp.getEmproject().getClass().getName());
	}

}
