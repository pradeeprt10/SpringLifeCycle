package ConStructor_Overloading;

public class ConOverLoading {
	
	private String chocolate_Name;
	private int price;
	
	
	public ConOverLoading() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ConOverLoading(String chocolate_Name, double price) {
		System.out.println("Inside String Double");
		this.chocolate_Name = chocolate_Name;
		this.price = (int)price;	
	}
		
	public ConOverLoading(String chocolate_Name, int price) {
		System.out.println("Inside String int");
		this.chocolate_Name = chocolate_Name;
		this.price = price;
	}
	
	public ConOverLoading(String chocolate_Name, String price) {
		System.out.println("Inside String String");
		this.chocolate_Name = chocolate_Name;
		this.price = Integer.parseInt(price);	
	}

	@Override
	public String toString() {
		return "ConOverLoading [chocolate_Name=" + chocolate_Name + ", price=" + price + "]";
	}


	
}
