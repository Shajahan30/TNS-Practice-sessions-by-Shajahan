package DAY3;

import java.util.Scanner;

public class personDemo {

	public static void main(String[] args) {
		//scanner object to accept user inputs
		Scanner ob= new Scanner(System.in);
		
		String name;
		System.out.println("Enter Person Name: ");
		name= ob.next();
		System.out.println("Enter Age ");
		int age= ob.next();
		System.out.println("Enter gender: ");
		String gender = ob.next();
		System.out.println("Enter Income: ");
		int income= ob.next();
		
		person p1 = new person();
		p1.setName(name);
		p1.setAge(age);
		p1.setGender(gender);
		p1.setIncome(income);

	}

}
