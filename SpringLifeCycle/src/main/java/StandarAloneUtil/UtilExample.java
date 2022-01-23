package StandarAloneUtil;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UtilExample {
 private List<String> empAddress;
 private Map<String,Integer> empPhone;
 private Properties emproject;
public List<String> getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(List<String> empAddress) {
	this.empAddress = empAddress;
}
public Map<String, Integer> getEmpPhone() {
	return empPhone;
}
public void setEmpPhone(Map<String, Integer> empPhone) {
	this.empPhone = empPhone;
}
public Properties getEmproject() {
	return emproject;
}
public void setEmproject(Properties emproject) {
	this.emproject = emproject;
}
@Override
public String toString() {
	return "UtilExample [empAddress=" + empAddress + "//n ====, empPhone=" + empPhone + ", emproject=" + emproject + "]";
}
 
 
}
