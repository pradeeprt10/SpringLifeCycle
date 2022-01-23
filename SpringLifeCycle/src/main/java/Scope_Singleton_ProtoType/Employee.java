package Scope_Singleton_ProtoType;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Employee {
   @Value("Pradeep Rout") 
	private String name;
   @Value("200000") 
	private int salary;
   @Value("Archetect") 
	private String designation;
   @Value("#{lis}")
	private List address;
	
	
	public String getName() {
		return name;
	}
	public List getSddress() {
		return address;
	}
	public void setSddress(List address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + ", address=" + address
				+ "]";
	}
	
	
	
}
