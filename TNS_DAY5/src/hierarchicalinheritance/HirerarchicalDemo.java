package hierarchicalinheritance;

public class HirerarchicalDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(":::::person Details::::");
		System.out.println(p1);
		
		Person p;
		p= new Person("Shaan","Pune");
		System.out.println("Person Details: "+p);
		
		p= new Employee("Tabby","Pune",1001,40000f,"Civil");
		System.out.println("Employee Details: "+ p);
		
		p=new Student("Sadia","Dubai","FE",88);
		

	}

}
