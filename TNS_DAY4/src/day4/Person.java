package day4;

public class Person {
	
	private String personName;
	private int personAge;
	private String personCity;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int age) {
		this.personAge = age;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String city) {
		this.personCity = city;
	}
	public Person() {
		System.out.println("Default constructor");
	}
	public Person(String personName, int personAge, String personCity) {
		System.out.println("Parameterized constructor");
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}
	
	
	

}
