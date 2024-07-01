package day4;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1= new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault = 12;
		b1.methodDefault();
		
		System.out.println(b1 instanceof Base);
		

	}

}
