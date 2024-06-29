package DAY3;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerCity;
	
	public Customer() {
		System.out.println("This is default constructor");
	}

	public Customer(String customerName, int customerId, String customerCity) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	}

}
