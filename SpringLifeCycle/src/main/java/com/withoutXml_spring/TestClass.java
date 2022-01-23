package com.withoutXml_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext cxt = new AnnotationConfigApplicationContext(Configuration_Class.class);
	Company cc = cxt.getBean("companyObj",Company.class);
	System.out.println(cc);
			
	
	}

}
