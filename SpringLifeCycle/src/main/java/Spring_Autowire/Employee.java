package Spring_Autowire;

public class Employee {

	private Address add;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address add) {
		super();
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}

}
