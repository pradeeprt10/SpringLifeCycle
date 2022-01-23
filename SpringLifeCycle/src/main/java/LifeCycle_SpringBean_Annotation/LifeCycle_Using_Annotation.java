package LifeCycle_SpringBean_Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycle_Using_Annotation {
private String currecy;
private String Country;
public String getCurrecy() {
	return currecy;
}
public void setCurrecy(String currecy) {
	this.currecy = currecy;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
@PostConstruct
public void start() {
	
	System.out.println("Init methord called using Annotation");
}

@PreDestroy
public void end() {
	System.out.println("Destroy methord called using Annotation");	
}
@Override
public String toString() {
	return "LifeCycle_Using_Annotation [currecy=" + currecy + ", Country=" + Country + "]";
}

}
