package DAY3;

public class Base {
	
	int varDefault = 10;
	public int varPublic= 20;
	private int varPrivate= 30;
	protected int varProtected = 40;
	
	void methodDefault() {
		System.out.println("public acess base class");
		System.out.println("Public variable: " + varPublic);
	}
	
	private void methodPrivate() {
		System.out.println("Protected access base");
		System.out.println("Protected variable: "+ varPrivate);
	}
	
	protected void methodProtected() {
		System.out.println("Protected access base");
		System.out.println("Protected variable: "+ varProtected);
	}

}
