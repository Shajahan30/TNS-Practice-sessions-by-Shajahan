package day4_thirdPackage;

public class MyClass {
	private static MyClass obj= new MyClass();
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	MyClass() {
		System.out.println("MyClass object created");
	}
	
	public static MyClass getObject() {
		return obj;
		
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	

}
