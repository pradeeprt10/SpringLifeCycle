package com.withoutXml_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Configuration_Class {

	
	@Bean public Employee getEmpRef() { return new Employee(); }
	  
	@Bean public Emp_Sal_Structure getEmp_Sal_StructureReft() { return new
	 Emp_Sal_Structure(); }
	 
	@Bean
	public Company companyObj() {
		return new Company();
	}

}
