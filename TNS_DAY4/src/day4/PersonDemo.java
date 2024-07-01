package day4;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person();
		Scanner sc = new Scanner(System.in);
		String name, city;
		int age;
		System.out.println("Enter Person details: Name, Age and City");
		name = sc.nextLine();
		age= sc.nextInt();
		sc.nextLine();
		city= sc.nextLine();
		
		p1.setPersonAge(age);
		p1.setpersonCity(city);
		p1.setPersonName();
		

	}

}
