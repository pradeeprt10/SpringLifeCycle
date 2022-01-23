package com.withoutXml_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp_Sal_Structure {
@Value("50000.00")	
private double empSal;
@Value("20000.00")
private double conSal;
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}
public double getConSal() {
	return conSal;
}
public void setConSal(double conSal) {
	this.conSal = conSal;
}
	

}
