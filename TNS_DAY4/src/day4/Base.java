package day4;

public class Base {
	
	int varDefault = 10;
	public int varPublic= 20;
	private int varPrivate= 30;
	protected int varProtected = 40;
	
	void methodDefault() {
		System.out.println("public acess base class");
		System.out.println("Default variable: " + varDefault);
	}
	
	private void methodPrivate() {
		System.out.println("Private access base");
		System.out.println("Private variable: "+ varPrivate);
	}
	
	protected void methodProtected() {
		System.out.println("Protected access base");
		System.out.println("Protected variable: "+ varProtected);
	}
	
	public void methodPublic() {
		System.out.println("Public access base");
		System.out.println("Public variable: "+ varPublic);
	}

}
