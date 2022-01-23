package WithoutXML_Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Bhubana")
	private String name;
	@Value("500")
	private  int stdid;
	@Autowired
	private Dept dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public void display() {
		 System.out.println("Name :" + this.getName()+"STD ID : "+ this.getStdid()+" Dept "+ this.dept.getDeptName());
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", stdid=" + stdid + ", dept=" + dept + "]";
	}

	
	
}
