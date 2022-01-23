package Autowire_Annotation;

public class Address {
	String State;
	String Country;
		
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String state, String country) {
		super();
		State = state;
		Country = country;
	}

	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}


	@Override
	public String toString() {
		return "Address [State=" + State + ", Country=" + Country + "]";
	}

}
