package SterioAnnotation_Component;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// this is used instead of Bean
@Component
@Scope("prototype")

public class Student {
   @Value("Pradeep Rout")   
	private String name;
   @Value("100") 
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
