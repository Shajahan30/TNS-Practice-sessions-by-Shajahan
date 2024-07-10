package interfaceDemo;

public class SavingAccount extends Customer implements Bank{
	
	private int accNo;
	private float amount;
	private float balance;
	
	

	public SavingAccount(String name, String city, int accNo, float amount) {
		super(name, city);
		this.accNo = accNo;
		this.amount = amount;
	}
	
	

	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public float getAmount() {
		return amount;
	}



	public void setAmount(float amount) {
		this.amount = amount;
	}



	@Override
	public void deposite(float amount) {
		if(amount<0 || amount> Deposite_Limit) {
			System.out.println("Please deposite valid amount");
		}
		else {
			balance += amount;
			System.out.println("Rs: "+amount +"is Deposited Successfully");
		}
		
	}

	@Override
	public void withdraw(float amount) {
		if(amount<)
		
	}

}
