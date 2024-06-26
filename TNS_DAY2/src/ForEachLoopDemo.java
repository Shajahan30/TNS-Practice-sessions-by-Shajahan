
public class ForEachLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50};
		for(int i: a)
		System.out.println(i);
		
		char ch[]= {'i', 'j', 'k','l'};
		for (char c: ch) {
			System.out.println(c);
		}
		
		String s1[]= {"Java ", "programming ", "Language "};
		for(String s2: s1) {
			System.out.print(s2);
		}

	}

}
