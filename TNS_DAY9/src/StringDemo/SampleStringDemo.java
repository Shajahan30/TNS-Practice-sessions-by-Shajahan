package StringDemo;

public class SampleStringDemo {

	public static void main(String[] args) {
		char c[]= {'I','N','D','I','A'};
		
		String s1= new String(c);
		System.out.println(s1);
		
		String s2= new String(s1);
		System.out.println(s2);
		
		String longstr="this is to show"+ "Contatination of string";
		
		System.out.println(longstr);
		

	}

}
