package UsingFinal;

public class FinalMethodClassTest extends FinalMethodClass {
	//compile time error
	@Override void show() {
		System.out.println("This is the final method of final method class");
	}
	

}
