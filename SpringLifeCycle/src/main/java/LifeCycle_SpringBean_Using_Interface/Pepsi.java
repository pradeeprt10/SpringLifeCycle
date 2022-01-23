package LifeCycle_SpringBean_Using_Interface;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

	private String state;
	private int price;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pepsi [state=" + state + ", price=" + price + "]";
	}
	
	public void afterPropertiesSet() {
		System.out.println("Inside InitializingBean: afterPropertiesSet methord ");
	}
	
	public void destroy() {
		
		System.out.println("Inside Disposible Interface : destroy methord");
	}
	
}
