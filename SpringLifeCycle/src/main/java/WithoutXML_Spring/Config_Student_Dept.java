package WithoutXML_Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config_Student_Dept {
    @Bean
	public Student getstd() {
		return new Student();
	}
	
	/*
	 * @Bean public Dept getDpt() { return new Dept(); }
	 */
}
