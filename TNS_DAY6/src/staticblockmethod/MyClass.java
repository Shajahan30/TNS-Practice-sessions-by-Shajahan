package staticblockmethod;

public class MyClass {
	
	private int section; //non static variable or instance variable
	private static int srNo; //static or class variable
	
	static {
		System.out.println(":::Within static block:::");
		srNo=1000;
	}

	public MyClass() {
		System.out.println("::::Within Default Constructor::::");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	static void display() {
		System.out.println("Serial No: "+ srNo);
	}
	
	

}
