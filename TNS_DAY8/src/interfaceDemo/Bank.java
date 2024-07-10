package interfaceDemo;

public interface Bank {
	final static float MINBAL =5000;
	final static float Deposite_Limit =25000;
	
	public void deposite(float amount);
	public void withdraw(float amount);
	

}
