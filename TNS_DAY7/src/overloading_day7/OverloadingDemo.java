package overloading_day7;

public class OverloadingDemo {

	public static void main(String[] args) {
		System.out.println("....Constructor Overloading.....");
		Point p= new Point();
		System.out.println(p);
		
		Point p1= new Point(14.5f);
		System.out.println(p1);
		
		Point p2=new Point(12.5f,20.50f);
		System.out.println(p2);
		
		System.out.println("....Method Overloading..........");
		System.out.println("Addition of two integers:"+MethodOverloading.addition(5, 100));
		System.out.println("Addition of floats: "+MethodOverloading.addition(1.5f, 2.3f));
		System.out.println("Addition of Strings: "+MethodOverloading.addition("41", "41"));

	}

}
