package StringDemo;

public class StringOperationDemo {

	public static void main(String[] args) {
		String s1 = new String (" Indian ");
		System.out.println(s1);
		String s2= s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.length());
		int a=s2.length();
		System.out.println("Length is: "+a);
		String s3= s1.substring(1,7);
		System.out.println(s3);
		System.out.println(s1.trim());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
	}

}
