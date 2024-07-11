package StringDemo;

public class StringComparison {

	public static void main(String[] args) {
		String s1 ="TNSIF";
		String s2= "TNSIF";
		
		String s3 = new String("TNSIF");
		String s4 = new String("TNSIF");
		
		// == operator used to compare object reference
		// equals operator is used to compare data
		
		System.out.println("case 1: "+ (s1==s2)); //true
		System.out.println("case 2: "+ (s1==s3)); // false
		System.out.println("case 3: "+ s2.equals(s1)); //true
		System.out.println("case 4: "+ s2.equals(s3)); //true
		
		System.out.println(s1.compareTo("TNSIF"));
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s4));

	}

}
