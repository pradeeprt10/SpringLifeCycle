package LifeCycle_SpringCore;

public class Life_Cycle_Example {
	private int price;
	private String name;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Life_Cycle_Example [price=" + price + ", name=" + name + "]";
	}

	public void initCustomized() {
		System.out.println("Inside Init");
	}

	public void destroyCustomized() {
		System.out.println("Inside Destroy");
	}
}
