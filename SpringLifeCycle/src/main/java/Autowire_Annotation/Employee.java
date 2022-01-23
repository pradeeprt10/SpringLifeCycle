package Autowire_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
@Autowired
@Qualifier("add2")
	private Address add;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Address add) {
		super();
		this.add = add;
		System.out.println("Inside Constructor");
	}

	public Address getAdd() {
		return add;
	}
	
	public void setAdd(Address add) {
		this.add = add;
		System.out.println("Inside Setter");
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}

}
