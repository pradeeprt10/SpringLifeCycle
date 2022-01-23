package com.withoutXml_spring;

import org.springframework.beans.factory.annotation.Autowired;


public class Company {
 @Autowired
	private Employee emp;
 @Autowired
	private Emp_Sal_Structure sal;
 
@Override
public String toString() {
	return "Company [empAddress=" + emp.getAddress()+" empAge = "+emp.getAge()+" empName = "+emp.getName()+ "  Empsal=" + sal.getEmpSal() + "  Contsal=  " +sal.getConSal() + "]";
}
 
 
}
